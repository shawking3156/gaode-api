package com.xy.gaodeapi.dto.request;

import com.xy.gaodeapi.api.GaodeApiRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: xiaoyin
 * @description:
 */
@Data
@ApiModel("输入提示")
public class GaodeInputtipsRequest extends GaodeApiRequest {


    @ApiModelProperty(value = "查询关键词",required = true)
    private String keywords;


    @ApiModelProperty(value = "POI分类",notes = "服务可支持传入多个分类，多个类型剑用“|”分隔\n" +
            "\n" +
            "可选值：POI分类名称、分类代码\n" +
            "\n" +
            "此处强烈建议使用分类代码")
    private String type;

    @ApiModelProperty(value = "坐标",notes = "格式：“X,Y”（经度,纬度），不可以包含空格\n" +
            "\n" +
            "建议使用location参数，可在此location附近优先返回搜索关键词信息\n" +
            "\n" +
            "在请求参数city不为空时生效")
    private String location;

    @ApiModelProperty(value = "搜索城市",notes = "可选值：citycode、adcode，不支持县级市")
    private String city;

    @ApiModelProperty(value = "仅返回指定城市数据",notes = "可选值：true/false")
    private Boolean citylimit;

    @ApiModelProperty(value = "返回的数据类型",notes = "多种数据类型用“|”分隔，可选值：all-返回所有数据类型、poi-返回POI数据类型、" +
            "bus-返回公交站点数据类型、busline-返回公交线路数据类型")
    private String datatype;


    @Override
    public String url() {
        return "/v3/assistant/inputtips";
    }

    @Override
    public boolean post() {
        return false;
    }
}
