package com.xy.gaodeapi.dto.response;

import com.xy.gaodeapi.api.GaodeApiResponse;
import com.xy.gaodeapi.model.WeatherForecasts;
import com.xy.gaodeapi.model.WeatherLives;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author: xiaoyin
 * @description:
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GaodeWeatherResponse extends GaodeApiResponse {

    @ApiModelProperty("预报天气信息数据")
    private List<WeatherForecasts> forecasts;

    @ApiModelProperty("实况天气数据信息")
    private List<WeatherLives> lives;
}
