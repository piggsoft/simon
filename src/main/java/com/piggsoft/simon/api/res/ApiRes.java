package com.piggsoft.simon.api.res;

import com.piggsoft.simon.api.constants.APIConstants;
import org.springframework.http.ResponseEntity;

/**
 * Created by piggs on 2017/3/31.
 * 统一的api返回数据
 */
public class ApiRes<T> {

    private int code;
    private T data;
    private String message;

    public ApiRes() {
    }

    public ApiRes(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static ApiRes<Object> ok() {
        return new ApiRes(APIConstants.API_SUCCESS_CODE,
                APIConstants.API_SUCCESS_MESSAGE,
                null);
    }

    public static <T> ApiRes<T> ok(T t) {
       return new ApiRes(APIConstants.API_SUCCESS_CODE,
               APIConstants.API_SUCCESS_MESSAGE,
               t);
    }

    public static ApiRes<Object> error(int code, String message) {
        return new ApiRes(code, message, null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
