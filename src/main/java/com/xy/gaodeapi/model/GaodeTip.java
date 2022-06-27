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
@ApiModel("高德输入提示")
public class GaodeTip {

    @ApiModelProperty(value = "tip名称",dataType = "string")
    private String name;

    @ApiModelProperty(value = "所属区域",dataType = "string",notes = "省+市+区（直辖市为“市+区”）\n" )
    private String district;

    @ApiModelProperty(value = "区域编码",dataType = "string",notes = "六位区县编码\n" )
    @JSONField(alternateNames = "adcode")
    private String adCode;

    @ApiModelProperty(value = "tip中心点坐标",dataType = "string")
    private String location;

    @ApiModelProperty(value = "详细地址",dataType = "string")
    private String address;
}
