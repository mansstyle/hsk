package com.home.jjh.hsk.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 **/
@Getter
@Setter
@ToString
public class eventModel{
    //goods_id
    private String eventId ;
    private String clickCount;
    private String endDate;
    private String eventContent;
    private String imgUrlContent;
    private String imgUrlMain;
    private String startDate;

}
