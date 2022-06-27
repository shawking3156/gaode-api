package com.xy.gaodeapi.api;

import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xy.gaodeapi.config.GaodeProperties;
import com.xy.gaodeapi.dto.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author: xiaoyin
 * @description:
 */
@Component
@Slf4j
public class GaodeApiHelper {

    public static final String LOG_HEAD = "[gaode] ";
    @Autowired
    private GaodeProperties gaodeProperties;

    public <E extends GaodeApiRequest, T extends GaodeApiResponse> ResponseResult<T> call(E request, Class<T> clazz) {
        request.setKey(gaodeProperties.getKey());
        return request.post() ? executePost(request, clazz) : executeGet(request, clazz);
    }

    public <E extends GaodeApiRequest, T extends GaodeApiResponse> ResponseResult<T> executePost(E request, Class<T> clazz) {
        String result = HttpUtil.post(getParams(request), request.toString());
        return generate(result, clazz);
    }

    public <E extends GaodeApiRequest, T extends GaodeApiResponse> ResponseResult<T> executeGet(E request, Class<T> clazz) {
        JSONObject jsonObject = (JSONObject) JSON.toJSON(request);
        String result = HttpUtil.get(getParams(request), jsonObject);
        return generate(result, clazz);
    }

    private <E extends GaodeApiRequest> String getParams(E request) {
        JSONObject map = (JSONObject) JSON.toJSON(request);
        String url = gaodeProperties.getDomain() + request.url() + "?";
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            url += entry.getKey() + "=" + entry.getValue() + "&";
        }
        return url.substring(0, url.length() - 1);
    }

    private <T extends GaodeApiResponse> ResponseResult<T> generate(String result, Class<T> clazz) {

        if (StrUtil.isBlank(result)) {
            return ResponseResult.fail();
        }
        T response = JSONObject.parseObject(result, clazz);
        if (response == null || !response.isSuccess()) {
            log.error(LOG_HEAD + " api callback : {}", result);
            return ResponseResult.fail();
        }
        return ResponseResult.success(response);
    }
}
