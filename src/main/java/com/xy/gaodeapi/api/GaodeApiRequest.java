package com.xy.gaodeapi.api;

/**
 * @author: xiaoyin
 * @description:
 */
public abstract class GaodeApiRequest {

    protected abstract String url();

    protected abstract boolean post();

    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
