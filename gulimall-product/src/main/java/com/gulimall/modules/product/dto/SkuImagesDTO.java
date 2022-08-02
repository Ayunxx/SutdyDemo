package com.gulimall.modules.product.dto;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * sku图片
 *
 * @author Ayun Ayun@gmail.com
 * @since 1.0.0 2022-08-01
 */
@Data
//sku图片
public class SkuImagesDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	//id
	private Long id;

	//sku_id
	private Long skuId;

	//图片地址
	private String imgUrl;

	//排序
	private Integer imgSort;

	//默认图[0 - 不是默认图，1 - 是默认图]
	private Integer defaultImg;


}