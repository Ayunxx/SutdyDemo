package com.gulimall.modules.product.dao;

import com.gulimall.common.dao.BaseDao;
import com.gulimall.modules.product.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author Ayun Ayun@gmail.com
 * @since 1.0.0 2022-08-01
 */
@Mapper
public interface CategoryDao extends BaseDao<CategoryEntity> {
	
}