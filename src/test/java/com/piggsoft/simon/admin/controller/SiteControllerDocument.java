package com.piggsoft.simon.admin.controller;

import com.piggsoft.simon.SimonApplicationTests;
import org.junit.Test;
import org.springframework.http.MediaType;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by piggs on 2017/4/2.
 */
public class SiteControllerDocument extends SimonApplicationTests {

    @Test
    public void registerSite() throws Exception {
        getMockMvc().perform(post("/admin/site")
                .param("siteName", "哈哈")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(document("/index"));
    }

}