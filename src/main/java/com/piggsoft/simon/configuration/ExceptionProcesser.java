package com.piggsoft.simon.configuration;

import com.piggsoft.simon.api.ApiResponse;
import com.piggsoft.simon.constants.APIConstants;
import com.piggsoft.simon.constants.Constants;
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

    /**
     * 统一的参数验证异常处理
     * @param e
     * @return
     */
    @ExceptionHandler(value = BindException.class)
    @ResponseBody
    public ResponseEntity<ApiResponse> handleException(BindException e) {
        BindingResult bindingResult = e.getBindingResult();
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        String[] strArray = new String[fieldErrors.size()];
        for (int i=0; i<fieldErrors.size(); i++) {//组合异常
            FieldError fieldError = fieldErrors.get(i);
            strArray[i] = fieldError.getField() + Constants.MESSAGE_FIELD_SEPARATOR + fieldError.getDefaultMessage();
        }

        return ApiResponse.error(APIConstants.PARAMS_ERROR_CODE, String.join(Constants.FIELD_FIELD_SEPARATOR, strArray));
    }
}
