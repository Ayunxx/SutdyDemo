package com.gulimall.modules.product.dto;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 商品三级分类
 *
 * @author Ayun Ayun@gmail.com
 * @since 1.0.0 2022-08-01
 */
@Data
//商品三级分类
public class CategoryDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	//分类id
	private Long catId;

	//分类名称
	private String name;

	//父分类id
	private Long parentCid;

	//层级
	private Integer catLevel;

	//是否显示[0-不显示，1显示]
	private Integer showStatus;

	//排序
	private Integer sort;

	//图标地址
	private String icon;

	//计量单位
	private String productUnit;

	//商品数量
	private Integer productCount;


}