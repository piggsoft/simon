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
import org.springframework.hateoas.Link;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author yaochen4
 * @version 1.0
 * @create 2017/4/5
 * @since 1.0
 */
@Controller
@RequestMapping(APIConstants.API_FRONT_PREFIX + "/posts")
public class PostController {

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public ApiRes<PostReq> add(@Validated @RequestBody PostReq req) {
        req.add(linkTo(methodOn(PostController.class).add(req)).withSelfRel());
        return ApiRes.ok(req);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ApiRes<Object> query(@PathVariable("id") Integer id) {
        linkTo(PostController.class).withSelfRel();
        return ApiRes.ok(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ApiRes<Object> list() {
        return null;
    }
}
