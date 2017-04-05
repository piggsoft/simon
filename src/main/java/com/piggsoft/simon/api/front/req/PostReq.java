/*
 *
 * Copyright (C) 1999-2016 IFLYTEK Inc.All Rights Reserved.
 * History：
 * Version   Author      Date                              Operation
 * 1.0       yaochen4    2017/4/5                           Create
 */
package com.piggsoft.simon.api.front.req;

import java.util.Date;

/**
 * @author yaochen4
 * @version 1.0
 * @create 2017/4/5
 * @since 1.0
 */
public class PostReq {

    private String title;
    private String content;
    private Date createTm;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTm() {
        return createTm;
    }

    public void setCreateTm(Date createTm) {
        this.createTm = createTm;
    }
}
