package com.gulimall.modules.product;

import com.gulimall.modules.product.dto.BrandDTO;
import com.gulimall.modules.product.entity.BrandEntity;
import com.gulimall.modules.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandDTO brandDTO = new BrandDTO();
        brandDTO.setDescript("");
        brandDTO.setName("华为");
        brandService.save(brandDTO);
        System.out.println("-------------");

    }

}
