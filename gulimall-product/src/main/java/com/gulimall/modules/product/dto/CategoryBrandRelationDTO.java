package com.gulimall.modules.product.dto;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 品牌分类关联
 *
 * @author Ayun Ayun@gmail.com
 * @since 1.0.0 2022-08-01
 */
@Data
//品牌分类关联
public class CategoryBrandRelationDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	//
	private Long id;

	//品牌id
	private Long brandId;

	//分类id
	private Long catelogId;

	//
	private String brandName;

	//
	private String catelogName;


}