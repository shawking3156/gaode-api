package com.xy.gaodeapi.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: xiaoyin
 * @description:
 */
@Data
@ApiModel(value = "逆地理编码列表",
description =  "batch 字段设置为 true 时为批量请求，" +
        "此时 regeocodes 标签返回，标签下为 regeocode 对象列表；" +
        "batch 为false 时为单个请求，会返回 regeocode 对象；regeocode 对象包含的数据如下")
public class GaodeRegeocode {

    @ApiModelProperty("地址元素列表")
    private GaodeAddressComponent addressComponent;
}
