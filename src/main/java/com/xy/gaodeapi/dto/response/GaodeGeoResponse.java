package com.xy.gaodeapi.dto.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.xy.gaodeapi.api.GaodeApiResponse;
import com.xy.gaodeapi.model.GaodeGeoCode;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author: xiaoyin
 * @description:
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GaodeGeoResponse extends GaodeApiResponse {

    @JSONField(name = "geocodes")
    private List<GaodeGeoCode> geoCodes;
}
