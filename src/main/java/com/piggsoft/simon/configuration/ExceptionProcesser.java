package com.piggsoft.simon.configuration;

import com.piggsoft.simon.api.res.ApiRes;
import com.piggsoft.simon.api.constants.APIConstants;
import com.piggsoft.simon.constants.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by piggs on 2017/3/31.
 */
@ControllerAdvice
public class ExceptionProcesser {

    public static final Logger LOGGER = LoggerFactory.getLogger(ExceptionProcesser.class);

    /**
     * 统一的参数验证异常处理
     * @param e
     * @return
     */
    @ExceptionHandler(value = BindException.class)
    @ResponseBody
    public ApiRes<Object> handleException(BindException e) {

        LOGGER.error(e.getMessage(), e);

        BindingResult bindingResult = e.getBindingResult();
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        String[] strArray = new String[fieldErrors.size()];
        for (int i=0; i<fieldErrors.size(); i++) {//组合异常
            FieldError fieldError = fieldErrors.get(i);
            strArray[i] = fieldError.getField() + Constants.MESSAGE_FIELD_SEPARATOR + fieldError.getDefaultMessage();
        }

        return ApiRes.error(APIConstants.PARAMS_ERROR_CODE, String.join(Constants.FIELD_FIELD_SEPARATOR, strArray));
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ApiRes<Object> handleException(Exception e) {
        LOGGER.error(e.getMessage(), e);

        return ApiRes.error(APIConstants.API_ERROR_UNKNOW_CODE, e.getMessage());
    }
}
