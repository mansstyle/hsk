package com.home.jjh.hsk.mapper;

import com.home.jjh.hsk.model.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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
    /* 아이템 클릭 */
    void insertTbScore(tbScoreModel tbScoreModel) ;

    /* 아이템 클릭 counter */
    void insertTbCounter(@RequestParam("type")  String type , @RequestParam("count")  int count , @RequestParam("uid")  String uid , @RequestParam("id")  int id) ;

    void insertTbCodiList(tbCodiModel tbCodiModel) ;

    void insertTbMDPickList(tbMDPickModel tbMDPickModel) ;

    void deleteEvent(eventDeleteModel eventDeleteModel) ;

}