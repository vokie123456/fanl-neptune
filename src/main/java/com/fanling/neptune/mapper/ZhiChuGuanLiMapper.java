package com.fanling.neptune.mapper;

import com.fanling.neptune.entity.ZhiChuGuanLi;

import java.util.List;

public interface ZhiChuGuanLiMapper {
    /**
     * 获取数据列表
     *
     * @param zhiChuGuanLi
     * @return
     */
    List<ZhiChuGuanLi> selectZhiChuGuanLiList(ZhiChuGuanLi zhiChuGuanLi);

    /**
     * 根据id获取数据
     *
     * @param id
     * @return
     */
    ZhiChuGuanLi selectZhiChuGuanLiById(long id);

    /**
     * 插入数据
     *
     * @param zhiChuGuanLi
     * @return
     */
    int insertZhiChuGuanLi(ZhiChuGuanLi zhiChuGuanLi);

    /**
     * 删除数据
     *
     * @param id
     * @return
     */
    int deleteZhiChuGuanLiById(long id);

    /**
     * 更新数据
     *
     * @param zhiChuGuanLi
     * @return
     */
    int updateZhiChuGuanLi(ZhiChuGuanLi zhiChuGuanLi);

    /**
     * 按照支付类型统计金额
     *
     * @param zhiChuGuanLi
     * @return
     */
    String selectZhiChuGuanLiSumByType(ZhiChuGuanLi zhiChuGuanLi);

    /**
     * 按照年度支付类型统计金额
     *
     * @param zhiChuGuanLi
     * @return
     */
    String selectZhiChuGuanLiSumByTypeAndYear(ZhiChuGuanLi zhiChuGuanLi);

    /**
     * 上个月支出分类总额
     *
     * @param zhiChuGuanLi
     * @return
     */
    String selectZhiChuGuanLiSumByTypeAndYearAndMonth(ZhiChuGuanLi zhiChuGuanLi);
}
