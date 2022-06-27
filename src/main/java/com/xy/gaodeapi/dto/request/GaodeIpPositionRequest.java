package com.xy.gaodeapi.dto.request;

import com.xy.gaodeapi.api.GaodeApiRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: xiaoyin
 * @description:
 */
@ApiModel("ip请求参数")
@Data
public class GaodeIpPositionRequest extends GaodeApiRequest {

    @ApiModelProperty(value = "ip地址",notes = "需要搜索的IP地址（仅支持国内）\n" +
            "若用户不填写IP，则取客户http之中的请求来进行定位")
    private String ip;

    @Override
    protected String url() {
        return "/v3/ip";
    }

    @Override
    protected boolean post() {
        return false;
    }
}
