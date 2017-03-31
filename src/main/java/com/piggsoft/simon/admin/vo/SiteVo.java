package com.piggsoft.simon.admin.vo;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by piggs on 2017/3/31.
 */
public class SiteVo {

    @NotBlank
    private String hostName;
    private String owername;
    private String title;

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }
}
