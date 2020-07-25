package com.home.jjh.hsk.mapper;

import java.util.List;

import com.home.jjh.hsk.model.DbTestCamelCaseModel;
import com.home.jjh.hsk.model.DbTestModel;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

	DbTestModel getApi2Data();

	List<DbTestCamelCaseModel> getApi3Data();
	
}