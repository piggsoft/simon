package com.piggsoft.simon.api;

import com.piggsoft.simon.constants.APIConstants;
import org.springframework.http.ResponseEntity;

/**
 * Created by piggs on 2017/3/31.
 */
public class ApiResponse {

    private int code;
    private Object data;
    private String message;

    public ApiResponse() {
    }

    public ApiResponse(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static ResponseEntity<ApiResponse> ok() {
        return ResponseEntity.ok(new ApiResponse(APIConstants.API_SUCCESS_CODE,
                APIConstants.API_SUCCESS_MESSAGE,
                null));
    }

    public static ResponseEntity<ApiResponse> ok(Object o) {
       return ResponseEntity.ok(new ApiResponse(APIConstants.API_SUCCESS_CODE,
               APIConstants.API_SUCCESS_MESSAGE,
               o));
    }

    public static ResponseEntity<ApiResponse> error(int code, String message) {
        return ResponseEntity.badRequest().body(new ApiResponse(code, message, null));
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
