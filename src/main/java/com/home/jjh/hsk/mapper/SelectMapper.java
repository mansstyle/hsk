package com.home.jjh.hsk.mapper;

import com.home.jjh.hsk.model.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
public interface SelectMapper {
    //select user data post --
    List<user> getApiUser(@RequestParam("email") String email);
}