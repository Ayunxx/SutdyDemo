package com.gulimall.modules.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gulimall.common.service.impl.CrudServiceImpl;
import com.gulimall.modules.product.dao.SkuSaleAttrValueDao;
import com.gulimall.modules.product.dto.SkuSaleAttrValueDTO;
import com.gulimall.modules.product.entity.SkuSaleAttrValueEntity;
import com.gulimall.modules.product.service.SkuSaleAttrValueService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author Ayun Ayun@gmail.com
 * @since 1.0.0 2022-08-01
 */
@Service
public class SkuSaleAttrValueServiceImpl extends CrudServiceImpl<SkuSaleAttrValueDao, SkuSaleAttrValueEntity, SkuSaleAttrValueDTO> implements SkuSaleAttrValueService {

    @Override
    public QueryWrapper<SkuSaleAttrValueEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SkuSaleAttrValueEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}