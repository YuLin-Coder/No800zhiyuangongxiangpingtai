package com.dao;

import com.entity.XuexizhiyuanCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexizhiyuanCollectionView;

/**
 * 学习资源收藏 Dao 接口
 *
 * @author 
 * @since 2021-04-06
 */
public interface XuexizhiyuanCollectionDao extends BaseMapper<XuexizhiyuanCollectionEntity> {

   List<XuexizhiyuanCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
