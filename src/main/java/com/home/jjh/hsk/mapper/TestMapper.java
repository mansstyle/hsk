package com.home.jjh.hsk.mapper;

import java.util.List;

import com.home.jjh.hsk.model.*;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

@Mapper
public interface TestMapper {
    DbTestModel getApi2Data();
    List<DbTestCamelCaseModel> getApi3Data();

}