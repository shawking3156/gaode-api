package com.xy.gaodeapi.dto.response;

import com.xy.gaodeapi.api.GaodeApiResponse;
import com.xy.gaodeapi.model.GaodeRegeocode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author: xiaoyin
 * @description:
 */
@Data
@ApiModel("逆地理编码响应结果")
public class GaodeRegeoResponse extends GaodeApiResponse {

    @ApiModelProperty("逆地理编码列表")
    private List<GaodeRegeocode> regeoodes;

}
