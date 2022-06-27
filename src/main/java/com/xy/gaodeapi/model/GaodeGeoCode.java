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
@ApiModel("地理编码信息列表")
public class GaodeGeoCode {

    @ApiModelProperty("国家")
    private String country;

    @ApiModelProperty("地址所在的省份名")
    private String province;

    @ApiModelProperty("地址所在的城市名")
    private String city;

    @ApiModelProperty("城市编码")
    @JSONField(name = "citycode")
    private String cityCode;

    @ApiModelProperty("地址所在的区")
    private String district;

    @ApiModelProperty("街道")
    private String street;

    @ApiModelProperty("门牌")
    private String number;

    @JSONField(name = "adcode")
    @ApiModelProperty("区域编码")
    private String adCode;

    @ApiModelProperty("坐标点")
    private String location;

    @ApiModelProperty("匹配级别")
    private String level;

}
