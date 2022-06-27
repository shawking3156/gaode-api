package com.xy.gaodeapi.dto.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.xy.gaodeapi.api.GaodeApiRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author: xiaoyin
 * @description:
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel("逆地理编码请求参数")
public class GaodeRegeoRequest extends GaodeApiRequest {


    @ApiModelProperty(value = "经纬度坐标",notes = "要解析多个经纬度的话，" +
            "请用\"|\"进行间隔，并且将 batch 参数设置为 true" +
            " 最多支持传入 20 对坐标点。每对点坐标之间用\"|\"分割。")
    private String location;

    @ApiModelProperty("返回附近POI类型")
    private String poitype;


    @ApiModelProperty("搜索半径")
    private int radius = 1000;


    @ApiModelProperty(value = "道路等级",notes = "可选值：0，1\n" +
            "当roadlevel=0时，显示所有道路\n" +
            "当roadlevel=1时，过滤非主干道路，仅输出主干道路数据 ")
    @JSONField(name = "roadlevel")
    private int roadLevel = 1;


    @ApiModelProperty("批量查询控制")
    private boolean batch;


    @ApiModelProperty(value = "返回结果控制",notes = "extensions 参数默认取值是 base，也就是返回基本地址信息；\n" +
            "     extensions 参数取值为 all 时会返回基本地址信息")
    private String extensions;
    @Override
    public String url() {
        return "/v3/geocode/regeo";
    }

    @Override
    public boolean post() {
        return false;
    }
}
