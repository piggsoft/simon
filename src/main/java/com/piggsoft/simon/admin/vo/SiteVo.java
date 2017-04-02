package com.piggsoft.simon.admin.vo;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by piggs on 2017/3/31.
 */
public class SiteVo {

    @NotBlank
    private String siteName;
    private String owername;
    private String title;

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getOwername() {
        return owername;
    }

    public void setOwername(String owername) {
        this.owername = owername;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
