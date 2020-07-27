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
public class shopsModel{

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

    public shopsModel(){
        super();
    }
    public shopsModel(String shop_id, String add_info_as_phone, String add_info_ceo, String add_info_change_pay, String add_info_email, String add_info_internet_confirm_number, String add_info_tran_auto_type, String add_info_tran_customer_code, String add_info_tran_name, String add_info_trans_add_number, String add_info_trans_recall_add, String add_info_working_time, String basic_age_type, String basic_style, String basic_title_word, String shop_count_item_click, String shop_count_like, String shop_homepage, String shop_main_img, String shop_name) {
        super();
        this.shop_id = shop_id;
        this.add_info_as_phone = add_info_as_phone;
        this.add_info_ceo = add_info_ceo;
        this.add_info_change_pay = add_info_change_pay;
        this.add_info_email = add_info_email;
        this.add_info_internet_confirm_number = add_info_internet_confirm_number;
        this.add_info_tran_auto_type = add_info_tran_auto_type;
        this.add_info_tran_customer_code = add_info_tran_customer_code;
        this.add_info_tran_name = add_info_tran_name;
        this.add_info_trans_add_number = add_info_trans_add_number;
        this.add_info_trans_recall_add = add_info_trans_recall_add;
        this.add_info_working_time = add_info_working_time;
        this.basic_age_type = basic_age_type;
        this.basic_style = basic_style;
        this.basic_title_word = basic_title_word;
        this.shop_count_item_click = shop_count_item_click;
        this.shop_count_like = shop_count_like;
        this.shop_homepage = shop_homepage;
        this.shop_main_img = shop_main_img;
        this.shop_name = shop_name;
    }

//    @Override
//    public String toString() {
//        return "User [userId=" + userId + ", userPwd=" + userPwd + ", name=" + name + ", authType=" + authType
//                + ", timestamp=" + timestamp + ", isUpdate=" + isUpdate + "]";
//    }
}
