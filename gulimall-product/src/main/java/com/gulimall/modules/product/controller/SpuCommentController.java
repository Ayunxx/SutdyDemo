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
import com.gulimall.modules.product.dto.SpuCommentDTO;
import com.gulimall.modules.product.excel.SpuCommentExcel;
import com.gulimall.modules.product.service.SpuCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


/**
 * 商品评价
 *
 * @author Ayun Ayun@gmail.com
 * @since 1.0.0 2022-08-01
 */
@RestController
@RequestMapping("product/spucomment")
public class SpuCommentController {
    @Autowired
    private SpuCommentService spuCommentService;

    @GetMapping("page")
   // @RequiresPermissions("product:spucomment:page")
    public Result<PageData<SpuCommentDTO>> page( @RequestParam Map<String, Object> params){
        PageData<SpuCommentDTO> page = spuCommentService.page(params);

        return new Result<PageData<SpuCommentDTO>>().ok(page);
    }

    @GetMapping("{id}")
  //  @RequiresPermissions("product:spucomment:info")
    public Result<SpuCommentDTO> get(@PathVariable("id") Long id){
        SpuCommentDTO data = spuCommentService.get(id);

        return new Result<SpuCommentDTO>().ok(data);
    }

    @PostMapping
    @LogOperation("保存")
   // @RequiresPermissions("product:spucomment:save")
    public Result save(@RequestBody SpuCommentDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        spuCommentService.save(dto);

        return new Result();
    }

    @PutMapping
    @LogOperation("修改")
   // @RequiresPermissions("product:spucomment:update")
    public Result update(@RequestBody SpuCommentDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        spuCommentService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @LogOperation("删除")
  //  @RequiresPermissions("product:spucomment:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        spuCommentService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @LogOperation("导出")
   // @RequiresPermissions("product:spucomment:export")
    public void export(@RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<SpuCommentDTO> list = spuCommentService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, SpuCommentExcel.class);
    }

}