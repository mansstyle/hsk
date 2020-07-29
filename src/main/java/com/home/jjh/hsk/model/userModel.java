package com.home.jjh.hsk.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class userModel{

    private String uid;
    private String displayname;
    private String email;
    private String bannerId;
    private String phoneNumber;
    private String photoUrl;
    private String providerId;
    private String tokenGoogle;

}
