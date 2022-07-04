package com.shejimoshi.single;

public enum ResultEnum {
    SUCCESS(101, "成功"), Failed(102, "失败");
    private final int code;
    private final String message;

    ResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
