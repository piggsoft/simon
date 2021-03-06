package com.piggsoft.simon.api.admin.controller;

import com.piggsoft.simon.SimonApplicationTests;
import com.piggsoft.simon.api.admin.req.SiteReq;
import org.junit.Test;
import org.springframework.http.MediaType;

import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import static org.springframework.restdocs.request.RequestDocumentation.requestParameters;
import static org.springframework.restdocs.snippet.Attributes.key;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 * Created by piggs on 2017/4/2.
 */
public class SiteControllerDocumentation extends SimonApplicationTests {

    @Test
    public void registerSite() throws Exception {

        ParamsConstrainedFields fields = new ParamsConstrainedFields(SiteReq.class);

        getMockMvc().perform(post("/api/v1/admin/site")
                .param("siteName", "哈哈")
                .param("owner", "飞翔的猪猪侠")
                .param("title", "小毛驴的技术空间")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(getDocumentationHandler().document(
                        requestParameters(
                                fields.withName("siteName").description("网站名称").attributes(key("type").value("String")),
                                fields.withName("owner").description("拥有者姓名").attributes(key("type").value("String")),
                                fields.withName("title").description("网站标题").attributes(key("type").value("String"))
                        ),
                        responseFields(
                                fieldWithPath("siteName").description("网站名称"),
                                fieldWithPath("owner").description("拥有者姓名"),
                                fieldWithPath("title").description("网站标题")
                                )
                )
                );
    }

}