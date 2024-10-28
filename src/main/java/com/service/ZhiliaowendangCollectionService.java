package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiliaowendangCollectionEntity;
import java.util.Map;

/**
 * 资料文档收藏 服务类
 * @author 
 * @since 2021-04-06
 */
public interface ZhiliaowendangCollectionService extends IService<ZhiliaowendangCollectionEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}