package com.home.jjh.hsk.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**intro*/
@Getter @Setter @ToString
public class introModel2 {

//    private String adId ;
//    private String dataAd ;
//    private String emgContent ;
//    private String emgTitle ;
//    private String lastAos ;
//    private String lastIos ;
//    private String upMsgAos ;
//    private String upMsgIos ;
//    private String verAos ;
//    private String verIos ;
//
//    private String upTitleAos ;
//    private String upTitleIos ;
////    private String a.adId ,
//    private String cnt ;
//    private String startDate ;
//    private String endDate ;
//    private String cntMax ;
////    private String a2.adId ,
//    private String adDetailUrl ;
//    private String adMsg ;
//    private String adNo ;
//    private String adStoreName ;
//    private String adUrl ;

    private String dataAd  ;
    private String emgContent  ;
    private String emgTitle  ;
    private String lastAos  ;
    private String lastIos  ;
    private String upMsgAos  ;
    private String upMsgIos  ;
    private String verAos  ;
    private String verIos  ;
    private String upTitleAos ;
    private String upTitleIos  ;
    private String adData  ;//( SELECT JSON_ARRAYAGG(JSON_OBJECT("adId", adId ,"adDetailUrl" , adDetailUrl , "adMsg" , adMsg , "adNo" , adNo , "adStoreName" , adStoreName)) FROM addata ) ,
    private String adItem ; //( SELECT JSON_ARRAYAGG(JSON_OBJECT("adId", adId , "imgUrl" , imgUrl , "itemClickUrl" , itemClickUrl , "bannerType" , bannerType)) FROM mainbanneritem )

}
