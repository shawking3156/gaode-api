package com.xy.gaodeapi.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: xiaoyin
 * @description:
 */
@Data
@ApiModel("门牌信息列表")
public class GaodeStreetNumber {

    @ApiModelProperty("街道名称")
    private String street;

    @ApiModelProperty("门牌号")
    private String number;

    @ApiModelProperty("坐标点")
    private String location;

    @ApiModelProperty("方向")
    private String direction;

    @ApiModelProperty("门牌地址到请求坐标的距离")
    private String distance;
}
