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
import com.gulimall.modules.product.dto.AttrDTO;
import com.gulimall.modules.product.excel.AttrExcel;
import com.gulimall.modules.product.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


/**
 * 商品属性
 *
 * @author Ayun Ayun@gmail.com
 * @since 1.0.0 2022-08-01
 */
@RestController
@RequestMapping("product/attr")
public class AttrController {
    @Autowired
    private AttrService attrService;

    @GetMapping("page")
   // @RequiresPermissions("product:attr:page")
    public Result<PageData<AttrDTO>> page( @RequestParam Map<String, Object> params){
        PageData<AttrDTO> page = attrService.page(params);

        return new Result<PageData<AttrDTO>>().ok(page);
    }

    @GetMapping("{id}")
  //  @RequiresPermissions("product:attr:info")
    public Result<AttrDTO> get(@PathVariable("id") Long id){
        AttrDTO data = attrService.get(id);

        return new Result<AttrDTO>().ok(data);
    }

    @PostMapping
    @LogOperation("保存")
   // @RequiresPermissions("product:attr:save")
    public Result save(@RequestBody AttrDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        attrService.save(dto);

        return new Result();
    }

    @PutMapping
    @LogOperation("修改")
   // @RequiresPermissions("product:attr:update")
    public Result update(@RequestBody AttrDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        attrService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @LogOperation("删除")
  //  @RequiresPermissions("product:attr:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        attrService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @LogOperation("导出")
   // @RequiresPermissions("product:attr:export")
    public void export(@RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<AttrDTO> list = attrService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, AttrExcel.class);
    }

}