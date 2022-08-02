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
import com.gulimall.modules.product.dto.CategoryBrandRelationDTO;
import com.gulimall.modules.product.excel.CategoryBrandRelationExcel;
import com.gulimall.modules.product.service.CategoryBrandRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


/**
 * 品牌分类关联
 *
 * @author Ayun Ayun@gmail.com
 * @since 1.0.0 2022-08-01
 */
@RestController
@RequestMapping("product/categorybrandrelation")
public class CategoryBrandRelationController {
    @Autowired
    private CategoryBrandRelationService categoryBrandRelationService;

    @GetMapping("page")
   // @RequiresPermissions("product:categorybrandrelation:page")
    public Result<PageData<CategoryBrandRelationDTO>> page( @RequestParam Map<String, Object> params){
        PageData<CategoryBrandRelationDTO> page = categoryBrandRelationService.page(params);

        return new Result<PageData<CategoryBrandRelationDTO>>().ok(page);
    }

    @GetMapping("{id}")
  //  @RequiresPermissions("product:categorybrandrelation:info")
    public Result<CategoryBrandRelationDTO> get(@PathVariable("id") Long id){
        CategoryBrandRelationDTO data = categoryBrandRelationService.get(id);

        return new Result<CategoryBrandRelationDTO>().ok(data);
    }

    @PostMapping
    @LogOperation("保存")
   // @RequiresPermissions("product:categorybrandrelation:save")
    public Result save(@RequestBody CategoryBrandRelationDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        categoryBrandRelationService.save(dto);

        return new Result();
    }

    @PutMapping
    @LogOperation("修改")
   // @RequiresPermissions("product:categorybrandrelation:update")
    public Result update(@RequestBody CategoryBrandRelationDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        categoryBrandRelationService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @LogOperation("删除")
  //  @RequiresPermissions("product:categorybrandrelation:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        categoryBrandRelationService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @LogOperation("导出")
   // @RequiresPermissions("product:categorybrandrelation:export")
    public void export(@RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<CategoryBrandRelationDTO> list = categoryBrandRelationService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, CategoryBrandRelationExcel.class);
    }

}