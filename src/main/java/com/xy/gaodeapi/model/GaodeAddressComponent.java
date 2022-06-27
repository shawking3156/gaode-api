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
@ApiModel("地址元素列表")
public class GaodeAddressComponent {

    @ApiModelProperty("坐标点所在省名称")
    private String province;

    @ApiModelProperty("坐标点所在市名称")
    private String city;

    @JSONField(name = "adcode")
    @ApiModelProperty("行政区编码")
    private String adCode;

    @ApiModelProperty("坐标点所在区")
    private String district;

    @ApiModelProperty("乡镇街道编码")
    @JSONField(name = "towncode")
    private String townCode;

    @ApiModelProperty("坐标点所在乡镇/街道（此街道为社区街道，不是道路信息）")
    private String township;

    @JSONField(name = "citycode")
    @ApiModelProperty("坐标点所在区")
    private String cityCode;

    @ApiModelProperty("门牌信息列表")
    private GaodeStreetNumber streetNumber;
}
