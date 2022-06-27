package com.xy.gaodeapi.enums;

/**
 * @author: xiaoyin
 * @description:
 */
public enum  ResponseCode {
    SUCCESS("1000", "成功"),
    FAIL("1001", "失败");

    private String name;
    private String desc;

    private ResponseCode(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String ResponseCode() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getName() {
        return this.name;
    }
}
