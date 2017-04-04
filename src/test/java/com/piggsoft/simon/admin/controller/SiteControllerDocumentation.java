package com.piggsoft.simon.admin.controller;

import com.piggsoft.simon.SimonApplicationTests;
import com.piggsoft.simon.admin.vo.SiteVo;
import org.junit.Test;
import org.springframework.http.MediaType;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import static org.springframework.restdocs.request.RequestDocumentation.requestParameters;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 * Created by piggs on 2017/4/2.
 */
public class SiteControllerDocumentation extends SimonApplicationTests {

    @Test
    public void registerSite() throws Exception {

        ParamsConstrainedFields fields = new ParamsConstrainedFields(SiteVo.class);

        getMockMvc().perform(post("/admin/site")
                .param("siteName", "哈哈")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(getDocumentationHandler().document(
                        requestParameters(fields.withName("siteName").description("网站名称")),
                        responseFields(
                        fieldWithPath("siteName").description("The user's contact details"))));
    }

}