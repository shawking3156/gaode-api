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
@ApiModel("实况天气数据信息")
public class WeatherLives {

    @ApiModelProperty("省份名")
    private String province;

    @ApiModelProperty("城市名")
    private String city;

    @ApiModelProperty("区域编码")
    private String adCode;

    @ApiModelProperty("天气现象（汉字描述）")
    private String weather;

    @ApiModelProperty("实时气温，单位：摄氏度")
    private String temperature;

    @JSONField(name = "winddirection")
    @ApiModelProperty("风向描述")
    private String windDirection;

    @ApiModelProperty("风力级别，单位：级")
    @JSONField(name = "windpower")
    private String windPower;

    @ApiModelProperty("空气湿度")
    private String humidity;

    @ApiModelProperty("数据发布的时间")
    @JSONField(name = "reporttime")
    private String reportTime;
}
