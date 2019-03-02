package com.fanling.neptune.controller;

import com.fanling.neptune.entity.MealsDay;
import com.fanling.neptune.service.MealsDayService;
import com.fanling.neptune.util.AjaxResult;
import com.fanling.neptune.util.TableDataInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/mealsday")
public class MealsDayController extends BaseController {
    private String prefix = "pages/mealsday/";

    @Autowired
    protected MealsDayService mealsDayService;

    @GetMapping
    public String mealsDay() {
        return prefix + "mealsday";
    }

    @GetMapping("/add")
    public String add() {
        return prefix + "mealsday-add";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        mmap.put("mealsday", mealsDayService.selectMealsDayById(id));
        return prefix + "mealsday-edit";
    }

    /**
     * 展示数据
     */
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MealsDay mealsDay) {
        startPage();
        List<MealsDay> list = mealsDayService.selectMealsDayList(mealsDay);
        return getDataTable(list);
    }

    /**
     * 新增数据
     */
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult save(MealsDay mealsDay) {
        return toAjax(mealsDayService.insertMealsDay(mealsDay));
    }

    /**
     * 修改数据
     */
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MealsDay mealsDay) {
        return toAjax(mealsDayService.updateMealsDay(mealsDay));
    }

    /**
     * 删除数据
     *
     * @param id
     * @return
     */
    @PostMapping("/remove/{id}")
    @ResponseBody
    public AjaxResult remove(@PathVariable("id") Long id) {
        return toAjax(0);//不允许删除
        //return toAjax(mealsDayService.deleteMealsDayById(id));
    }
}
