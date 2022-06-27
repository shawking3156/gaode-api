package com.xy.gaodeapi.dto.response;

import com.xy.gaodeapi.api.GaodeApiResponse;
import com.xy.gaodeapi.model.GaodeTip;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author: xiaoyin
 * @description:
 */
@Data
@ApiModel("高德输入提示-返回")
public class GaodeInputtipsResponse extends GaodeApiResponse {

    @ApiModelProperty(value = "建议提示列表")
    private List<GaodeTip> tips;
}
