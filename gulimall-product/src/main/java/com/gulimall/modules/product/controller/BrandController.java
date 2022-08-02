package com.gulimall.modules.product.controller;

import com.gulimall.common.annotation.LogOperation;
import com.gulimall.common.constant.Constant;
import com.gulimall.common.page.PageData;
import com.gulimall.common.utils.ExcelUtils;
import com.gulimall.common.utils.Result;
import com.gulimall.common.validator.AssertUtils;
import com.gulimall.common.validator.ValidatorUtils;
import com.gulimall.common.validator.group.AddGroup;
import com.gulimall.common.validator.group.DefaultGroup;
import com.gulimall.common.validator.group.UpdateGroup;
import com.gulimall.modules.product.dto.BrandDTO;
import com.gulimall.modules.product.excel.BrandExcel;
import com.gulimall.modules.product.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


/**
 * 品牌
 *
 * @author Ayun Ayun@gmail.com
 * @since 1.0.0 2022-08-01
 */
@RestController
@RequestMapping("product/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @GetMapping("page")
   // @RequiresPermissions("product:brand:page")
    public Result<PageData<BrandDTO>> page( @RequestParam Map<String, Object> params){
        PageData<BrandDTO> page = brandService.page(params);

        return new Result<PageData<BrandDTO>>().ok(page);
    }

    @GetMapping("{id}")
  //  @RequiresPermissions("product:brand:info")
    public Result<BrandDTO> get(@PathVariable("id") Long id){
        BrandDTO data = brandService.get(id);

        return new Result<BrandDTO>().ok(data);
    }

    @PostMapping
    @LogOperation("保存")
   // @RequiresPermissions("product:brand:save")
    public Result save(@RequestBody BrandDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        brandService.save(dto);

        return new Result();
    }

    @PutMapping
    @LogOperation("修改")
   // @RequiresPermissions("product:brand:update")
    public Result update(@RequestBody BrandDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        brandService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @LogOperation("删除")
  //  @RequiresPermissions("product:brand:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        brandService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @LogOperation("导出")
   // @RequiresPermissions("product:brand:export")
    public void export(@RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<BrandDTO> list = brandService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, BrandExcel.class);
    }

}