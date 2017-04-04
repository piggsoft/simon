package com.piggsoft.simon.admin.controller;

import com.piggsoft.simon.admin.vo.SiteVo;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by piggs on 2017/3/31.
 */
@Controller
@RequestMapping("/admin/site")
public class SiteController {

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Object registerSite(@Validated SiteVo siteVo) {
        return siteVo;
    }

}
