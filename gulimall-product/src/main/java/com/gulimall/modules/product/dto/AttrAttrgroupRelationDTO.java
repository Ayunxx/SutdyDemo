package com.gulimall.modules.product.dto;


import lombok.Data;

import java.io.Serializable;



/**
 * 属性&属性分组关联
 *
 * @author Ayun Ayun@gmail.com
 * @since 1.0.0 2022-08-01
 */
@Data
//属性&属性分组关联
public class AttrAttrgroupRelationDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	//id
	private Long id;

	//属性id
	private Long attrId;

	//属性分组id
	private Long attrGroupId;

	//属性组内排序
	private Integer attrSort;


}