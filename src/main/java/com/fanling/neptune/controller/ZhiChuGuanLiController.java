package com.fanling.neptune.controller;

import com.fanling.neptune.entity.ZhiChuGuanLi;
import com.fanling.neptune.service.ZhiChuGuanLiService;
import com.fanling.neptune.util.AjaxResult;
import com.fanling.neptune.util.TableDataInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/zhichuguanli")
public class ZhiChuGuanLiController extends BaseController {
    private String prefix = "pages/zhichuguanli/";

    @Autowired
    private ZhiChuGuanLiService zhiChuGuanLiService;

    @GetMapping
    public String zhichuguanli() {
        return prefix + "zhichuguanli";
    }

    @GetMapping("/add")
    public String add() {
        return prefix + "zhichuguanli-add";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        mmap.put("zhichuguanli", zhiChuGuanLiService.selectZhiChuGuanLiById(id));
        return prefix + "zhichuguanli-edit";
    }

    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ZhiChuGuanLi zhiChuGuanLi) {
        startPage();
        List<ZhiChuGuanLi> list = zhiChuGuanLiService.selectZhiChuGuanLiList(zhiChuGuanLi);
        return getDataTable(list);
    }

    /**
     * 新增数据
     */
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult save(ZhiChuGuanLi zhiChuGuanLi) {
        return toAjax(zhiChuGuanLiService.insertZhiChuGuanLi(zhiChuGuanLi));
    }

    /**
     * 修改数据
     */
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ZhiChuGuanLi zhiChuGuanLi) {
        return toAjax(zhiChuGuanLiService.updateZhiChuGuanLi(zhiChuGuanLi));
    }

}
