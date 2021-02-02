package com.home.jjh.hsk.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**item banner click count*/
@Getter
@Setter
@ToString
public class updateCountModel {
    /*
     * Type :  item , banner 우선 2가지로 선언
     * count : 필드만 가지고 오는거라 아무거나 상관없음 . 이전에는 카운트를 받을려해서 선언을 해둿음 , 삭제도 무관 대신 api 수정은 필요
     * uid : type + id 형태로 만들어 져 있음. shopName 도 넣어줘야 할거 같음.
     * id : 아이템의 id
     * */
    private String type;
    private int count;
    private String uid;
    private int id;

}
