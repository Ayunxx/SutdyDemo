package com.gulimall.modules.product.dto;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 属性分组
 *
 * @author Ayun Ayun@gmail.com
 * @since 1.0.0 2022-08-01
 */
@Data
//属性分组
public class AttrGroupDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	//分组id
	private Long attrGroupId;

	//组名
	private String attrGroupName;

	//排序
	private Integer sort;

	//描述
	private String descript;

	//组图标
	private String icon;

	//所属分类id
	private Long catelogId;


}