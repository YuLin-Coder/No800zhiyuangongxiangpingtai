package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.MianshitongzhiCollectionEntity;

import com.service.MianshitongzhiCollectionService;
import com.entity.view.MianshitongzhiCollectionView;
import com.service.MianshitongzhiService;
import com.entity.MianshitongzhiEntity;
import com.service.YonghuService;
import com.entity.YonghuEntity;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 面试通知收藏
 * 后端接口
 * @author
 * @email
 * @date 2021-04-06
*/
@RestController
@Controller
@RequestMapping("/mianshitongzhiCollection")
public class MianshitongzhiCollectionController {
    private static final Logger logger = LoggerFactory.getLogger(MianshitongzhiCollectionController.class);

    @Autowired
    private MianshitongzhiCollectionService mianshitongzhiCollectionService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;


    //级联表service
    @Autowired
    private MianshitongzhiService mianshitongzhiService;
    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role) || "老师".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = mianshitongzhiCollectionService.queryPage(params);

        //字典表数据转换
        List<MianshitongzhiCollectionView> list =(List<MianshitongzhiCollectionView>)page.getList();
        for(MianshitongzhiCollectionView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        MianshitongzhiCollectionEntity mianshitongzhiCollection = mianshitongzhiCollectionService.selectById(id);
        if(mianshitongzhiCollection !=null){
            //entity转view
            MianshitongzhiCollectionView view = new MianshitongzhiCollectionView();
            BeanUtils.copyProperties( mianshitongzhiCollection , view );//把实体数据重构到view中

            //级联表
            MianshitongzhiEntity mianshitongzhi = mianshitongzhiService.selectById(mianshitongzhiCollection.getMianshitongzhiId());
            if(mianshitongzhi != null){
                BeanUtils.copyProperties( mianshitongzhi , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setMianshitongzhiId(mianshitongzhi.getId());
            }
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(mianshitongzhiCollection.getYonghuId());
            if(yonghu != null){
                BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setYonghuId(yonghu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody MianshitongzhiCollectionEntity mianshitongzhiCollection, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,mianshitongzhiCollection:{}",this.getClass().getName(),mianshitongzhiCollection.toString());
        Wrapper<MianshitongzhiCollectionEntity> queryWrapper = new EntityWrapper<MianshitongzhiCollectionEntity>()
            .eq("mianshitongzhi_id", mianshitongzhiCollection.getMianshitongzhiId())
            .eq("yonghu_id", mianshitongzhiCollection.getYonghuId())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        MianshitongzhiCollectionEntity mianshitongzhiCollectionEntity = mianshitongzhiCollectionService.selectOne(queryWrapper);
        if(mianshitongzhiCollectionEntity==null){
            mianshitongzhiCollection.setInsertTime(new Date());
            mianshitongzhiCollection.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      mianshitongzhiCollection.set
        //  }
            mianshitongzhiCollectionService.insert(mianshitongzhiCollection);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody MianshitongzhiCollectionEntity mianshitongzhiCollection, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,mianshitongzhiCollection:{}",this.getClass().getName(),mianshitongzhiCollection.toString());
        //根据字段查询是否有相同数据
        Wrapper<MianshitongzhiCollectionEntity> queryWrapper = new EntityWrapper<MianshitongzhiCollectionEntity>()
            .notIn("id",mianshitongzhiCollection.getId())
            .andNew()
            .eq("mianshitongzhi_id", mianshitongzhiCollection.getMianshitongzhiId())
            .eq("yonghu_id", mianshitongzhiCollection.getYonghuId())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        MianshitongzhiCollectionEntity mianshitongzhiCollectionEntity = mianshitongzhiCollectionService.selectOne(queryWrapper);
        if(mianshitongzhiCollectionEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      mianshitongzhiCollection.set
            //  }
            mianshitongzhiCollectionService.updateById(mianshitongzhiCollection);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        mianshitongzhiCollectionService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }



    /**
    * 前端列表
    */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role) || "老师".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = mianshitongzhiCollectionService.queryPage(params);

        //字典表数据转换
        List<MianshitongzhiCollectionView> list =(List<MianshitongzhiCollectionView>)page.getList();
        for(MianshitongzhiCollectionView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
    MianshitongzhiCollectionEntity mianshitongzhiCollection = mianshitongzhiCollectionService.selectById(id);
        if(mianshitongzhiCollection !=null){
            //entity转view
    MianshitongzhiCollectionView view = new MianshitongzhiCollectionView();
            BeanUtils.copyProperties( mianshitongzhiCollection , view );//把实体数据重构到view中

            //级联表
                MianshitongzhiEntity mianshitongzhi = mianshitongzhiService.selectById(mianshitongzhiCollection.getMianshitongzhiId());
            if(mianshitongzhi != null){
                BeanUtils.copyProperties( mianshitongzhi , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setMianshitongzhiId(mianshitongzhi.getId());
            }
            //级联表
                YonghuEntity yonghu = yonghuService.selectById(mianshitongzhiCollection.getYonghuId());
            if(yonghu != null){
                BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setYonghuId(yonghu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody MianshitongzhiCollectionEntity mianshitongzhiCollection, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,mianshitongzhiCollection:{}",this.getClass().getName(),mianshitongzhiCollection.toString());
        Wrapper<MianshitongzhiCollectionEntity> queryWrapper = new EntityWrapper<MianshitongzhiCollectionEntity>()
            .eq("mianshitongzhi_id", mianshitongzhiCollection.getMianshitongzhiId())
            .eq("yonghu_id", mianshitongzhiCollection.getYonghuId())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
    MianshitongzhiCollectionEntity mianshitongzhiCollectionEntity = mianshitongzhiCollectionService.selectOne(queryWrapper);
        if(mianshitongzhiCollectionEntity==null){
            mianshitongzhiCollection.setInsertTime(new Date());
            mianshitongzhiCollection.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      mianshitongzhiCollection.set
        //  }
        mianshitongzhiCollectionService.insert(mianshitongzhiCollection);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}

