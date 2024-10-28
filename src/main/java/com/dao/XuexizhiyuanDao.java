package com.dao;

import com.entity.XuexizhiyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexizhiyuanView;

/**
 * 学习资源 Dao 接口
 *
 * @author 
 * @since 2021-04-06
 */
public interface XuexizhiyuanDao extends BaseMapper<XuexizhiyuanEntity> {

   List<XuexizhiyuanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
