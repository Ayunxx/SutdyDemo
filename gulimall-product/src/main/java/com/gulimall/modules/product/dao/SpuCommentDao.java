package com.gulimall.modules.product.dao;

import com.gulimall.common.dao.BaseDao;
import com.gulimall.modules.product.entity.SpuCommentEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 *
 * @author Ayun Ayun@gmail.com
 * @since 1.0.0 2022-08-01
 */
@Mapper
public interface SpuCommentDao extends BaseDao<SpuCommentEntity> {
	
}