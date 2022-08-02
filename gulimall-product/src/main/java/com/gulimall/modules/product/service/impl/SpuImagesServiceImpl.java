package com.gulimall.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulimall.common.service.impl.CrudServiceImpl;
import com.gulimall.modules.product.dao.SpuImagesDao;
import com.gulimall.modules.product.dto.SpuImagesDTO;
import com.gulimall.modules.product.entity.SpuImagesEntity;
import com.gulimall.modules.product.service.SpuImagesService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * spu图片
 *
 * @author Ayun Ayun@gmail.com
 * @since 1.0.0 2022-08-01
 */
@Service
public class SpuImagesServiceImpl extends CrudServiceImpl<SpuImagesDao, SpuImagesEntity, SpuImagesDTO> implements SpuImagesService {

    @Override
    public QueryWrapper<SpuImagesEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SpuImagesEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}