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
    private String event_id ;
    private String click_count;
    private String end_date;
    private String event_content;
    private String img_url_content;
    private String img_url_main;
    private String start_date;

}
