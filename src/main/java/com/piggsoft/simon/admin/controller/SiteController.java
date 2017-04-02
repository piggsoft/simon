package com.piggsoft.simon.admin.controller;

import com.piggsoft.simon.admin.vo.SiteVo;
import io.swagger.annotations.*;
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
@Api(value = "网站基础信息配置")
public class SiteController {

    @ApiOperation(value = "新增配置", notes = "网站基础配置是最基础的配置，必须有限配置")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "siteName", name = "网站名称")
    })
    @RequestMapping(value = "/site", method = RequestMethod.POST)
    @ResponseBody
    public Object registerSite(@Validated SiteVo siteVo) {
        return siteVo;
    }

}
