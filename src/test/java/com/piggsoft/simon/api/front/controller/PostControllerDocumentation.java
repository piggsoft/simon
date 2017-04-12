package com.piggsoft.simon.api.front.controller;

import com.piggsoft.simon.SimonApplicationTests;
import com.piggsoft.simon.api.constants.APIConstants;
import com.piggsoft.simon.api.front.req.PostReq;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.restdocs.hypermedia.HypermediaDocumentation.linkWithRel;
import static org.springframework.restdocs.hypermedia.HypermediaDocumentation.links;
import static org.springframework.restdocs.payload.PayloadDocumentation.requestFields;
import static org.springframework.restdocs.request.RequestDocumentation.parameterWithName;
import static org.springframework.restdocs.request.RequestDocumentation.pathParameters;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author yaochen4
 * @version 1.0
 * @create 2017/4/5
 * @since 1.0
 */
public class PostControllerDocumentation extends SimonApplicationTests {

    @Test
    public void add() throws Exception {
        BodyConstrainedFields fields = new BodyConstrainedFields(PostReq.class);

        Map<String, Object> params = new HashMap<>();
        params.put("title", "新的博客");

        getMockMvc().perform(post("/api/v1.0/front/posts")
            .contentType(MediaType.APPLICATION_JSON)
                .content(getObjectMapper().writeValueAsString(params))
        ).andExpect(status().isCreated())
                .andExpect(jsonPath("code").value(APIConstants.API_SUCCESS_CODE))
        .andDo(print())
        .andDo(getDocumentationHandler().document(
                requestFields(fields.withPath("title").description("post标题")),
                links(
                        linkWithRel("query").description("查询某个post")
                )
        ))
        ;
    }

    @Test
    public void query() throws Exception {
        getMockMvc()
                .perform(
                        RestDocumentationRequestBuilders.get("/api/front/v1.0/posts/{id}", 123)
                ).andExpect(status().isOk())
                .andDo(print())
                .andDo(getDocumentationHandler().document(
                        pathParameters(
                                parameterWithName("id").description("post id")
                        )
                ));
    }

}