package com.gulimall.modules.product.dto;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * sku销售属性&值
 *
 * @author Ayun Ayun@gmail.com
 * @since 1.0.0 2022-08-01
 */
@Data
//sku销售属性&值
public class SkuSaleAttrValueDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	//id
	private Long id;

	//sku_id
	private Long skuId;

	//attr_id
	private Long attrId;

	//销售属性名
	private String attrName;

	//销售属性值
	private String attrValue;

	//顺序
	private Integer attrSort;


}