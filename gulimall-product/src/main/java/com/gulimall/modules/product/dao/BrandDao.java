package com.gulimall.modules.product.dao;

import com.gulimall.common.dao.BaseDao;
import com.gulimall.modules.product.entity.BrandEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 *
 * @author Ayun Ayun@gmail.com
 * @since 1.0.0 2022-08-01
 */
@Mapper
public interface BrandDao extends BaseDao<BrandEntity> {
	
}