package com.fanling.neptune.service;

import com.fanling.neptune.entity.ZhiChuGuanLi;
import com.fanling.neptune.mapper.ZhiChuGuanLiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZhiChuGuanLiService {
    @Autowired
    private ZhiChuGuanLiMapper mapper;

    /**
     * 获取数据列表
     *
     * @param zhiChuGuanLi
     * @return
     */
    public List<ZhiChuGuanLi> selectZhiChuGuanLiList(ZhiChuGuanLi zhiChuGuanLi) {
        return mapper.selectZhiChuGuanLiList(zhiChuGuanLi);
    }

    /**
     * 根据id获取数据
     *
     * @param id
     * @return
     */
    public ZhiChuGuanLi selectZhiChuGuanLiById(long id) {
        return mapper.selectZhiChuGuanLiById(id);
    }

    /**
     * 插入数据
     *
     * @param zhiChuGuanLi
     * @return
     */
    public int insertZhiChuGuanLi(ZhiChuGuanLi zhiChuGuanLi) {
        return mapper.insertZhiChuGuanLi(zhiChuGuanLi);
    }

    /**
     * 删除数据
     *
     * @param id
     * @return
     */
    public int deleteZhiChuGuanLiById(long id) {
        return mapper.deleteZhiChuGuanLiById(id);
    }

    /**
     * 更新数据
     *
     * @param zhiChuGuanLi
     * @return
     */
    public int updateZhiChuGuanLi(ZhiChuGuanLi zhiChuGuanLi) {
        return mapper.updateZhiChuGuanLi(zhiChuGuanLi);
    }

    /**
     * 按照支付类型统计金额
     *
     * @param type
     * @return
     */
    public String selectZhiChuGuanLiSumByType(String type) {
        ZhiChuGuanLi zhiChuGuanLi = new ZhiChuGuanLi();
        zhiChuGuanLi.setType(type);
        return mapper.selectZhiChuGuanLiSumByType(zhiChuGuanLi);
    }

    /**
     * 按照年度支付类型统计金额
     *
     * @param type
     * @param year
     * @return
     */
    public String selectZhiChuGuanLiSumByTypeAndYear(String type, String year) {
        ZhiChuGuanLi zhiChuGuanLi = new ZhiChuGuanLi();
        zhiChuGuanLi.setType(type);
        zhiChuGuanLi.setYear(year);
        return mapper.selectZhiChuGuanLiSumByTypeAndYear(zhiChuGuanLi);
    }

    /**
     * 上个月支出分类总额
     *
     * @param type
     * @param year
     * @param month
     * @return
     */
    public String selectZhiChuGuanLiSumByTypeAndYearAndMonth(String type, String year, String month) {
        ZhiChuGuanLi zhiChuGuanLi = new ZhiChuGuanLi();
        zhiChuGuanLi.setType(type);
        zhiChuGuanLi.setYear(year);
        zhiChuGuanLi.setMonth(month);
        return mapper.selectZhiChuGuanLiSumByTypeAndYearAndMonth(zhiChuGuanLi);
    }
}
