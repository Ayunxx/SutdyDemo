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
import com.gulimall.modules.product.dto.SkuImagesDTO;
import com.gulimall.modules.product.excel.SkuImagesExcel;
import com.gulimall.modules.product.service.SkuImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


/**
 * sku图片
 *
 * @author Ayun Ayun@gmail.com
 * @since 1.0.0 2022-08-01
 */
@RestController
@RequestMapping("product/skuimages")
public class SkuImagesController {
    @Autowired
    private SkuImagesService skuImagesService;

    @GetMapping("page")
   // @RequiresPermissions("product:skuimages:page")
    public Result<PageData<SkuImagesDTO>> page( @RequestParam Map<String, Object> params){
        PageData<SkuImagesDTO> page = skuImagesService.page(params);

        return new Result<PageData<SkuImagesDTO>>().ok(page);
    }

    @GetMapping("{id}")
  //  @RequiresPermissions("product:skuimages:info")
    public Result<SkuImagesDTO> get(@PathVariable("id") Long id){
        SkuImagesDTO data = skuImagesService.get(id);

        return new Result<SkuImagesDTO>().ok(data);
    }

    @PostMapping
    @LogOperation("保存")
   // @RequiresPermissions("product:skuimages:save")
    public Result save(@RequestBody SkuImagesDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        skuImagesService.save(dto);

        return new Result();
    }

    @PutMapping
    @LogOperation("修改")
   // @RequiresPermissions("product:skuimages:update")
    public Result update(@RequestBody SkuImagesDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        skuImagesService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @LogOperation("删除")
  //  @RequiresPermissions("product:skuimages:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        skuImagesService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @LogOperation("导出")
   // @RequiresPermissions("product:skuimages:export")
    public void export(@RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<SkuImagesDTO> list = skuImagesService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, SkuImagesExcel.class);
    }

}