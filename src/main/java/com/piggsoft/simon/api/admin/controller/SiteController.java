package com.piggsoft.simon.api.admin.controller;

import com.piggsoft.simon.api.admin.req.SiteReq;
import com.piggsoft.simon.api.constants.APIConstants;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by piggs on 2017/3/31.
 */
@Controller
@RequestMapping(APIConstants.API_ADMIN_PREFIX + "/site")
public class SiteController {

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Object registerSite(@Validated SiteReq siteReq) {
        return siteReq;
    }

}
