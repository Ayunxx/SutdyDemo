package com.gulimall.modules.product.dto;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 商品评价回复关系
 *
 * @author Ayun Ayun@gmail.com
 * @since 1.0.0 2022-08-01
 */
@Data
//商品评价回复关系
public class CommentReplayDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	//id
	private Long id;

	//评论id
	private Long commentId;

	//回复id
	private Long replyId;


}