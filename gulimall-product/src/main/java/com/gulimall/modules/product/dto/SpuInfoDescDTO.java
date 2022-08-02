package com.gulimall.modules.product.dto;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * spu信息介绍
 *
 * @author Ayun Ayun@gmail.com
 * @since 1.0.0 2022-08-01
 */
@Data
//spu信息介绍
public class SpuInfoDescDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	//商品id
	private Long spuId;

	//商品介绍
	private String decript;


}