package com.fanling.neptune.service;

import com.fanling.neptune.entity.MealsDay;
import com.fanling.neptune.mapper.MealsDayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealsDayService {
    @Autowired
    private MealsDayMapper mapper;

    /**
     * 获取数据列表
     *
     * @param mealsDay
     * @return
     */
    public List<MealsDay> selectMealsDayList(MealsDay mealsDay){
        return mapper.selectMealsDayList(mealsDay);
    }

    /**
     * 根据id获取数据
     *
     * @param id
     * @return
     */
    public MealsDay selectMealsDayById(long id){
        return mapper.selectMealsDayById(id);
    }

    /**
     * 插入数据
     *
     * @param mealsDay
     * @return
     */
    public int insertMealsDay(MealsDay mealsDay){
        return mapper.insertMealsDay(mealsDay);
    }

    /**
     * 删除数据
     *
     * @param id
     * @return
     */
    public int deleteMealsDayById(long id){
        return mapper.deleteMealsDayById(id);
    }

    /**
     * 更新数据
     *
     * @param mealsDay
     * @return
     */
    public int updateMealsDay(MealsDay mealsDay){
        return mapper.updateMealsDay(mealsDay);
    }
}
