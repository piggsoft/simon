package com.piggsoft.simon.api.front.controller;

import com.piggsoft.simon.SimonApplicationTests;
import com.piggsoft.simon.api.front.req.PostReq;
import org.junit.Test;
import org.springframework.http.MediaType;

import java.util.HashMap;
import java.util.Map;

import static com.piggsoft.simon.api.res.ApiRes.ok;
import static org.springframework.restdocs.payload.PayloadDocumentation.requestFields;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
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

        getMockMvc().perform(post("/api/front/v1/post")
            .contentType(MediaType.APPLICATION_JSON)
                .content(getObjectMapper().writeValueAsString(params))
        ).andExpect(status().isCreated())
        .andDo(getDocumentationHandler().document(
                requestFields(fields.withPath("title").description("post标题"))
        ))
        ;
    }

}