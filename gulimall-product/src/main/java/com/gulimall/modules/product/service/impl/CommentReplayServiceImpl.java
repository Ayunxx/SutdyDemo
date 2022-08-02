package com.gulimall.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulimall.common.service.impl.CrudServiceImpl;
import com.gulimall.modules.product.dao.CommentReplayDao;
import com.gulimall.modules.product.dto.CommentReplayDTO;
import com.gulimall.modules.product.entity.CommentReplayEntity;
import com.gulimall.modules.product.service.CommentReplayService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author Ayun Ayun@gmail.com
 * @since 1.0.0 2022-08-01
 */
@Service
public class CommentReplayServiceImpl extends CrudServiceImpl<CommentReplayDao, CommentReplayEntity, CommentReplayDTO> implements CommentReplayService {

    @Override
    public QueryWrapper<CommentReplayEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<CommentReplayEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}