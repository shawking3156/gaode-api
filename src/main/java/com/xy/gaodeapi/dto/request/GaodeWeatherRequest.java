package com.xy.gaodeapi.dto.request;

import com.xy.gaodeapi.api.GaodeApiRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: xiaoyin
 * @description:
 */
@ApiModel("天气查询请求参数")
@Data
public class GaodeWeatherRequest extends GaodeApiRequest {

    @ApiModelProperty("城市")
    private String city;

    @ApiModelProperty("可选值：base/all\n" +
            "base:返回实况天气\n" +
            "all:返回预报天气")
    private String extension;

    @Override
    protected String url() {
        return "/v3/weather/weatherInfo";
    }

    @Override
    protected boolean post() {
        return false;
    }
}
