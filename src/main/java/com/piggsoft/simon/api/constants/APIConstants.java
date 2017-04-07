package com.piggsoft.simon.api.constants;

/**
 * Created by piggs on 2017/3/31.
 */
public class APIConstants {

    public static final String API_PREFIX = "/api/{version}";
    public static final String API_ADMIN_PREFIX = API_PREFIX + "/admin/";
    public static final String API_FRONT_PREFIX = API_PREFIX + "/front/";

    public static final int PARAMS_ERROR_CODE = 4001;
    public static final int API_SUCCESS_CODE = 0;
    public static final String API_SUCCESS_MESSAGE = "success";
    public static final int API_ERROR_UNKNOW_CODE = -1;
    public static final String API_ERROR_MESSAGE = "error";


}
