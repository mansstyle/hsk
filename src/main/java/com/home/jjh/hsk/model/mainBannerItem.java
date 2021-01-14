package com.home.jjh.hsk.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**intro banner item*/
@Getter
@Setter
@ToString
public class mainBannerItem {
    private String adStoreName;
    private String adNo;
    private String adMsg;
    private String imgUrl;
    private String adDetailUrl;
    private String itemClickUrl;
    private String bannerType;
}
