package com.piggsoft.simon.api.admin.req;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by piggs on 2017/3/31.
 */
public class SiteReq {

    @NotBlank
    private String siteName;
    @NotBlank
    private String owner;
    @NotBlank
    private String title;

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
