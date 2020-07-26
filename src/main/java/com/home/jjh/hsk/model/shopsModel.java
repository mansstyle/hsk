package com.home.jjh.hsk.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 *
 **/
@Getter
@Setter
@ToString
public class shopsModel {

    private String shop_id ;
    private String add_info_as_phone ;
    private String add_info_ceo ;
    private String add_info_change_pay ; //착불 선불
    private String add_info_email ;
    private String add_info_internet_confirm_number ;
    private String add_info_tran_auto_type ;
    private String add_info_tran_customer_code ;
    private String add_info_tran_name ;
    private String add_info_trans_add_number ;
    private String add_info_trans_recall_add ;
    private String add_info_working_time ;
    private String basic_age_type ; //10대 20대 30대 40대 이상
    private String basic_style; //{#모던 , #댄디}
    private String basic_title_word ;
    private String shop_count_item_click ;
    private String shop_count_like ;
    private String shop_homepage ;
    private String shop_main_img ;
    private String shop_name ;

}
