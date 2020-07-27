package com.home.jjh.hsk.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;


/**ad*/
@Getter
@Setter
@ToString
public class adModel {

    private String ad_id;
    private String cnt;

    private String start_date;
    private String end_date;
    private String cnt_max;
}
