package com.xy.gaodeapi.dto.request;

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
@ApiModel("地理编码请求对象")
public class GaodeGeoRequest extends GaodeApiRequest {


    @ApiModelProperty("结构化地址信息")
    private String address;


    @ApiModelProperty("指定查询的城市 无，会进行全国范围内搜索")
    private String city;


    @Override
    public String url() {
        return "/v3/geocode/geo";
    }

    @Override
    public boolean post() {
        return false;
    }
}
