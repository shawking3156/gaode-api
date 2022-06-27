package com.xy.gaodeapi.api;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author: xiaoyin
 * @description:
 */
@Data
public class GaodeApiResponse {

    /**
     * 1：成功；0：失败
     */
    private String status;

    private String info;

    /**
     * 10000代表成功，其余请参见错误编码
     */
    @JSONField(name = "infocode")
    private String infoCode;

    private String count;

    /**
     * 返回结果编码
     * 0表示成功
     */
    @JSONField(name = "errcode")
    private String errCode;

    /**
     * 返回状态说明
     * 成功时返回OK，否则返回错误原因
     */
    @JSONField(name = "errmsg")
    private String errMsg;

    /**
     * 错误具体原因
     */
    @JSONField(name = "errdetail")
    private String errDetail;



    public boolean isSuccess(){
        return "1".equalsIgnoreCase(status) || "0".equals(errCode);
    }
}
