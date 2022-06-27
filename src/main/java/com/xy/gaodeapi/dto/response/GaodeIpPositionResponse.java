package com.xy.gaodeapi.dto.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.xy.gaodeapi.api.GaodeApiResponse;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: xiaoyin
 * @description:
 */
@Data
public class GaodeIpPositionResponse extends GaodeApiResponse {

    @ApiModelProperty(value = "省份名称",notes = "若为直辖市则显示直辖市名称；\n" +
            "如果在局域网 IP网段内，则返回“局域网”；\n" +
            "非法IP以及国外IP则返回空")
    private String province;

    @ApiModelProperty(value = "城市名称",notes = "若为直辖市则显示直辖市名称；\n" +
            "如果为局域网网段内IP或者非法IP或国外IP，则返回空")
    private String city;

    @ApiModelProperty("城市的adcode编码")
    @JSONField(name = "adcode")
    private String adCode;

    @ApiModelProperty(value = "所在城市矩形区域范围",notes = "所在城市范围的左下右上对标对")
    private String rectangle;
}
