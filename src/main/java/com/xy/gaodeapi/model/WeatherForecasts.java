package com.xy.gaodeapi.model;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: xiaoyin
 * @description:
 */
@Data
@ApiModel("预报天气信息数据")
public class WeatherForecasts {

    @ApiModelProperty("日期")
    private String date;

    @ApiModelProperty("星期几")
    private String week;

    @ApiModelProperty("白天天气现象")
    @JSONField(name = "dayweather")
    private String dayWeather;

    @ApiModelProperty("晚上天气现象")
    @JSONField(name = "nightweather")
    private String nightWeather;

    @JSONField(name = "daytemp")
    @ApiModelProperty("白天温度")
    private String dayTemp;

    @JSONField(name = "nighttemp")
    @ApiModelProperty("晚上温度")
    private String nightTemp;

    @ApiModelProperty("白天风向")
    @JSONField(name = "daywind")
    private String dayWind;

    @ApiModelProperty("晚上风向")
    @JSONField(name = "nightwind")
    private String nightwind;

    @ApiModelProperty("白天风力")
    @JSONField(name = "daypower")
    private String daypower;

    @ApiModelProperty("晚上风力")
    @JSONField(name = "nightpower")
    private String nightpower;
}
