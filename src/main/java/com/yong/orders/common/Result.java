package com.yong.orders.common;


import com.google.common.base.Strings;

import static com.google.common.base.Preconditions.checkArgument;
import static com.yong.orders.common.ResultCode.SUCCESS;

/**
 * Created by yong.a.liang on 6/22/2017.
 */
public class Result<T> {

    private int code = SUCCESS;
    private String message;
    private T payload;

    public Result() {

    }

    private Result(int code, String message, T payload) {
        this.code = code;
        this.message = message;
        this.payload = payload;
    }

    public static Result success() {
        return new Result();
    }

    public static <O> Result<O> success(O payload) {
        checkArgument(payload != null, "payload should be not null");
        return new Result<>(SUCCESS, null, payload);
    }

    public static <O> Result<O> fail(int code, String message) {
        checkArgument(!Strings.isNullOrEmpty(message), "message should be not empty");
        checkArgument(code > 0, "code should be greater than 0");
        return new Result<>(code, message, null);
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getPayload() {
        return payload;
    }
}
