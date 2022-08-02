package com.gulimall.modules.product.dto;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 品牌
 *
 * @author Ayun Ayun@gmail.com
 * @since 1.0.0 2022-08-01
 */
@Data
//品牌
public class BrandDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	//品牌id
	private Long brandId;

	//品牌名
	private String name;

	//品牌logo地址
	private String logo;

	//介绍
	private String descript;

	//显示状态[0-不显示；1-显示]
	private Integer showStatus;

	//检索首字母
	private String firstLetter;

	//排序
	private Integer sort;


}