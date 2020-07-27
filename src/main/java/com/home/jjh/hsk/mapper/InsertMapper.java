package com.home.jjh.hsk.mapper;

import com.home.jjh.hsk.model.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InsertMapper {
    //insert user data post --
    void setApiUser(userModel userModel);
    void setApiMain_banner_item(main_banner_item main_banner_item);
    /* 스토어등록 */
    void insertShop(shopsModel shopsModel) ;
    /* 아이템 등록 */
    void insertNewItem(itemModel itemModel) ;
    /* 아이템 디테일 등록 */
    void insertItemDetail(itemDetailModel itemDetailModel) ;
    /* 이벤트 등록 */
    void insertEvent(eventModel eventModel) ;
}