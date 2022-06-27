package com.xy.gaodeapi.dto;

import com.xy.gaodeapi.enums.ResponseCode;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: xiaoyin
 * @description:
 */
@Data
public class ResponseResult<R> implements Serializable {

    private boolean success;
    private String code;
    private String msg;
    private R data;

    public static <R> ResponseResult<R> success() {
        return success(null);
    }

    public static <R> ResponseResult<R> success(R data) {
        return build(ResponseCode.SUCCESS.getName(), ResponseCode.SUCCESS.getDesc(), data);
    }

    public static <R> ResponseResult<R> build(String code, String message, R data) {
        ResponseResult<R> result = new ResponseResult<>();
        result.setCode(code);
        result.setMsg(message);
        result.setData(data);
        return result;
    }

    public static <R> ResponseResult<R> fail() {
        return build(ResponseCode.FAIL.getName(),ResponseCode.FAIL.getDesc(),null);
    }

    public static <R> ResponseResult<R> fail(String message, R result) {
        return build(ResponseCode.FAIL.getName(),message,result);
    }

    public static <R> ResponseResult<R> fail(String message) {
        return fail(message,null);
    }
}
