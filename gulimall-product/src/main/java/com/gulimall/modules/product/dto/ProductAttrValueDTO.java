package com.gulimall.modules.product.dto;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * spu属性值
 *
 * @author Ayun Ayun@gmail.com
 * @since 1.0.0 2022-08-01
 */
@Data
//spu属性值
public class ProductAttrValueDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	//id
	private Long id;

	//商品id
	private Long spuId;

	//属性id
	private Long attrId;

	//属性名
	private String attrName;

	//属性值
	private String attrValue;

	//顺序
	private Integer attrSort;

	//快速展示【是否展示在介绍上；0-否 1-是】
	private Integer quickShow;


}