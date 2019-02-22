package com.fanling.neptune.controller;

import com.fanling.neptune.entity.ZhuData;
import com.fanling.neptune.service.ZhiChuGuanLiService;
import com.fanling.neptune.util.TableDataInfo;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@RequestMapping("/zhichutongji")
public class ZhiChuTongJiController extends BaseController {
    private String prefix = "pages/zhichutongji/";

    @Autowired
    private ZhiChuGuanLiService zhiChuGuanLiService;

    @GetMapping
    public String zhichutongji() {
        return prefix + "zhichutongji";
    }

    @PostMapping("/typedata")
    @ResponseBody
    public Map<String, String> getTypeData() {
        //所有类别
        Map<String, String> typeNames = new HashMap<>();
        typeNames.put("10", "交行信用卡");
        typeNames.put("11", "招行信用卡");
        typeNames.put("20", "支付宝花呗");
        typeNames.put("21", "支付宝借呗");
        typeNames.put("30", "商业贷款");
        Map<String, String> typeData = new HashMap<>();
        typeNames.forEach((key, value) -> {
            typeData.put(value, zhiChuGuanLiService.selectZhiChuGuanLiSumByType(key));
        });
        return typeData;
    }

    @PostMapping("/zhudata")
    @ResponseBody
    public TableDataInfo getZhuData() {
        List<ZhuData> list = new ArrayList<>();
        startPage();
        for (int i = 2016; i <= Integer.valueOf(DateFormatUtils.format(new Date(), "yyyy")); i++) {
            ZhuData zhuData = new ZhuData();
            zhuData.setYear(String.valueOf(i));//填充年份
            //交行信用卡
            zhuData.setyData1(zhiChuGuanLiService.selectZhiChuGuanLiSumByTypeAndYear("10", zhuData.getYear()));
            //招行信用卡
            zhuData.setyData2(zhiChuGuanLiService.selectZhiChuGuanLiSumByTypeAndYear("11", zhuData.getYear()));
            //支付宝花呗
            zhuData.setyData3(zhiChuGuanLiService.selectZhiChuGuanLiSumByTypeAndYear("20", zhuData.getYear()));
            //支付宝借呗
            zhuData.setyData4(zhiChuGuanLiService.selectZhiChuGuanLiSumByTypeAndYear("21", zhuData.getYear()));
            //商业贷款
            zhuData.setyData5(zhiChuGuanLiService.selectZhiChuGuanLiSumByTypeAndYear("30", zhuData.getYear()));
            list.add(zhuData);
        }
        return getDataTable(list);
    }

    @PostMapping("/zhu2data")
    @ResponseBody
    public TableDataInfo getZhu2Data() {
        List<ZhuData> list = new ArrayList<>();
        startPage();
        ZhuData zhuData = new ZhuData();
        Date date = new Date();//获取当前时间    
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -1);//当前时间前去一个月，即一个月前的时间    
        String year = (DateFormatUtils.format(calendar.getTime(), "yyyy"));
        String month = (DateFormatUtils.format(calendar.getTime(), "MM"));
        //交行信用卡
        zhuData.setyData1(zhiChuGuanLiService.selectZhiChuGuanLiSumByTypeAndYearAndMonth("10", year, month));
        //招行信用卡
        zhuData.setyData2(zhiChuGuanLiService.selectZhiChuGuanLiSumByTypeAndYearAndMonth("11", year, month));
        //支付宝花呗
        zhuData.setyData3(zhiChuGuanLiService.selectZhiChuGuanLiSumByTypeAndYearAndMonth("20", year, month));
        //支付宝借呗
        zhuData.setyData4(zhiChuGuanLiService.selectZhiChuGuanLiSumByTypeAndYearAndMonth("21", year, month));
        //商业贷款
        zhuData.setyData5(zhiChuGuanLiService.selectZhiChuGuanLiSumByTypeAndYearAndMonth("30", year, month));
        list.add(zhuData);
        return getDataTable(list);
    }
}
