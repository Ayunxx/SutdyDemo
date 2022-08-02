package com.gulimall.modules.product.dto;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * spu图片
 *
 * @author Ayun Ayun@gmail.com
 * @since 1.0.0 2022-08-01
 */
@Data
//spu图片
public class SpuImagesDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	//id
	private Long id;

	//spu_id
	private Long spuId;

	//图片名
	private String imgName;

	//图片地址
	private String imgUrl;

	//顺序
	private Integer imgSort;

	//是否默认图
	private Integer defaultImg;


}