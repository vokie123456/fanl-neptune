package com.fanling.neptune.entity;

import java.util.Date;

/**
 * 每日餐饮支出
 */
public class MealsDay {
    private long id;
    private String breakfast;
    private String bfMoney;
    private String lunch;
    private String lMoney;
    private String dinner;
    private String dMoney;
    private String party;
    private String pMoney;
    private String relax;
    private String rMoney;
    private String remark;
    private Date myDay;
    private Date createTime;
    private Date updateTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public String getBfMoney() {
        return bfMoney;
    }

    public void setBfMoney(String bfMoney) {
        this.bfMoney = bfMoney;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public String getlMoney() {
        return lMoney;
    }

    public void setlMoney(String lMoney) {
        this.lMoney = lMoney;
    }

    public String getDinner() {
        return dinner;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }

    public String getdMoney() {
        return dMoney;
    }

    public void setdMoney(String dMoney) {
        this.dMoney = dMoney;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getpMoney() {
        return pMoney;
    }

    public void setpMoney(String pMoney) {
        this.pMoney = pMoney;
    }

    public String getRelax() {
        return relax;
    }

    public void setRelax(String relax) {
        this.relax = relax;
    }

    public String getrMoney() {
        return rMoney;
    }

    public void setrMoney(String rMoney) {
        this.rMoney = rMoney;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getMyDay() {
        return myDay;
    }

    public void setMyDay(Date myDay) {
        this.myDay = myDay;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
