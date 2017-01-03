package com.pyn.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * describtion: 县
 * Created by pengyn on 2016/8/31.
 */
public class County extends DataSupport{

    private int id;
    private String countyName;  // 县的名字
    private String countyCode;  // 县的代码
    private int cityId;         // 当前县所属市的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
