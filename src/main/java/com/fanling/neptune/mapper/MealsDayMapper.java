package com.fanling.neptune.mapper;

import com.fanling.neptune.entity.MealsDay;

import java.util.List;

public interface MealsDayMapper {
    /**
     * 获取数据列表
     *
     * @param mealsDay
     * @return
     */
    List<MealsDay> selectMealsDayList(MealsDay mealsDay);

    /**
     * 根据id获取数据
     *
     * @param id
     * @return
     */
    MealsDay selectMealsDayById(long id);

    /**
     * 插入数据
     *
     * @param mealsDay
     * @return
     */
    int insertMealsDay(MealsDay mealsDay);

    /**
     * 删除数据
     *
     * @param id
     * @return
     */
    int deleteMealsDayById(long id);

    /**
     * 更新数据
     *
     * @param mealsDay
     * @return
     */
    int updateMealsDay(MealsDay mealsDay);
}
