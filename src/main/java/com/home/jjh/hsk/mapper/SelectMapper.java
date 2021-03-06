package com.home.jjh.hsk.mapper;

import com.home.jjh.hsk.model.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
public interface SelectMapper {
    //select user data post --
    userModel getApiUser(@RequestParam("email") String email);
    //
    List<adModel> getApiAd();
    //
    List<introModel> getApiIntro();
    List<introModel2> getApiIntro2();

    //
    List<eventModel> getApiEvent();
    //
    List<itemModel> getApiItem();
    //
    List<adDataModel> getApiAdDataItem();
    //
    List<shopsModel> getApiShopsDataItem();

    //
    List<mainBannerItem> getApiMainBanner();
    //
    testJoinModel getApiTestJoin();


    List<newItemModel> getApiNewItem(@RequestParam("position") int page );

    List<newItemModel> getApiCodiItem(@RequestParam("position") int page );

    List<newItemModel> getApiMDItem(@RequestParam("position") int page );

    List<AdIntroBannerList> getAdIntroBannerList();

    List<searchItemModel> getSearchList(@RequestParam("text") String text);

    List<mainItemRandomModel> getMainShopRandomItem();



}