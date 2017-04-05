/*
 *
 * Copyright (C) 1999-2016 IFLYTEK Inc.All Rights Reserved.
 * History：
 * Version   Author      Date                              Operation
 * 1.0       yaochen4    2017/4/5                           Create
 */
package com.piggsoft.simon.api.front.controller;

import com.piggsoft.simon.api.constants.APIConstants;
import com.piggsoft.simon.api.front.req.PostReq;
import com.piggsoft.simon.api.res.ApiRes;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author yaochen4
 * @version 1.0
 * @create 2017/4/5
 * @since 1.0
 */
@Controller
@RequestMapping(APIConstants.API_FRONT_PREFIX + "/post")
public class PostController {

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public ApiRes<PostReq> add(@Validated @RequestBody PostReq req) {
        return ApiRes.ok(req);
    }

}
