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
public class itemModel {
    //goods_id
    private String shop_id;
    private String shop_item_detail_url;
    private String shop_item_name;
    private String shop_item_price_original;
    private String shop_item_price_sale;
    private String shop_item_url;
    private String shop_title;
    private String item_id;
}
