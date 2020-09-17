package com.home.jjh.hsk.mapper;

import com.home.jjh.hsk.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface InsertMapper {
    //insert user data post --
    List<userModel> setApiUser(userModel userModel);

    void setApiMainBannerItem(mainBannerItem mainBannerItem);
    /* 스토어등록 */
    void insertShop(shopsModel shopsModel) ;
    /* 아이템 등록 */
    void insertNewItem(itemModel itemModel) ;
    /* 아이템 디테일 등록 */
    void insertItemDetail(itemDetailModel itemDetailModel) ;
    /* 이벤트 등록 */
    void insertEvent(eventModel eventModel) ;
    /* 이벤트 등록 */
    void insertTbScore(tbScoreModel tbScoreModel) ;

    void insertTbCodiList(tbCodiModel tbCodiModel) ;

    void insertTbMDPickList(tbMDPickModel tbMDPickModel) ;

    void deleteEvent(eventDeleteModel eventDeleteModel) ;

}