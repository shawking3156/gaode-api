package com.xy.gaodeapi.controller;

import com.xy.gaodeapi.api.GaodeApiHelper;
import com.xy.gaodeapi.dto.ResponseResult;
import com.xy.gaodeapi.dto.request.GaodeGeoRequest;
import com.xy.gaodeapi.dto.request.GaodeInputtipsRequest;
import com.xy.gaodeapi.dto.request.GaodeIpPositionRequest;
import com.xy.gaodeapi.dto.request.GaodeWeatherRequest;
import com.xy.gaodeapi.dto.response.GaodeGeoResponse;
import com.xy.gaodeapi.dto.response.GaodeInputtipsResponse;
import com.xy.gaodeapi.dto.response.GaodeIpPositionResponse;
import com.xy.gaodeapi.dto.response.GaodeWeatherResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xiaoyin
 * @description:
 */
@RestController
@Api(tags = "高德接口")
@RequestMapping("/gaode")
public class GaodeController {

    @Autowired
    private GaodeApiHelper gaodeApiHelper;
    @ApiOperation("高德输入提示")
    @PostMapping("/input-tips")
    public ResponseResult<GaodeInputtipsResponse> gaodeInputips(@RequestBody GaodeInputtipsRequest request) {
        return gaodeApiHelper.call(request, GaodeInputtipsResponse.class);
    }

    @ApiOperation(value = "查询地理编码",notes = "将详细的结构化地址转换为高德经纬度坐标")
    @PostMapping("/geo")
    public ResponseResult<GaodeGeoResponse> geoQuery(@RequestBody GaodeGeoRequest request) {
        return gaodeApiHelper.call(request, GaodeGeoResponse.class);
    }


    @ApiOperation(value = "逆地理编码",notes = "将经纬度转换为详细结构化的地址")
    @PostMapping("/regeo")
    public ResponseResult<GaodeGeoResponse> regeoQuery(@RequestBody GaodeGeoRequest request) {
        return gaodeApiHelper.call(request, GaodeGeoResponse.class);
    }

    @ApiOperation(value = "查询ip地址归属地信息",notes = "将经纬度转换为详细结构化的地址")
    @PostMapping("/ip-location")
    public ResponseResult<GaodeIpPositionResponse> regeoQuery(@RequestBody GaodeIpPositionRequest request) {

        return gaodeApiHelper.call(request, GaodeIpPositionResponse.class);
    }

    @ApiOperation(value = "查询天气")
    @PostMapping("/weather")
    public ResponseResult<GaodeWeatherResponse> regeoQuery(@RequestBody GaodeWeatherRequest request) {
        return gaodeApiHelper.call(request, GaodeWeatherResponse.class);
    }
}
