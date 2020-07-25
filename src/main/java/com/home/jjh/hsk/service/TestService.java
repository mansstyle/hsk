package com.home.jjh.hsk.service;

import java.util.ArrayList;
import java.util.List;

import com.home.jjh.hsk.mapper.TestMapper;
import com.home.jjh.hsk.model.DbTestCamelCaseModel;
import com.home.jjh.hsk.model.DbTestModel;
import com.home.jjh.hsk.model.TestModel;
import com.home.jjh.hsk.model.TestSubModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {


	@Autowired
	private TestMapper testMapper;

	/**
	 * 테스트 api 생성
	 * @return
	 */
	public TestModel getApi1Data() {
		TestModel rtnData = new TestModel();

		List<TestSubModel> arrSubMode = new ArrayList<>();
		arrSubMode.add(new TestSubModel("1", "11"));
		arrSubMode.add(new TestSubModel("2", "22"));
		arrSubMode.add(new TestSubModel("3", "33"));
		arrSubMode.add(new TestSubModel("4", "44"));
		arrSubMode.add(new TestSubModel("5", "55"));
		arrSubMode.add(new TestSubModel("6", "66"));
		arrSubMode.add(new TestSubModel("7", "77"));
		arrSubMode.add(new TestSubModel("8", "88"));
		rtnData.setDataArray(arrSubMode);

		List<String> stringArray = new ArrayList<>();
		stringArray.add("테스트 스트링 데이터1");
		stringArray.add("테스트 스트링 데이터2");
		stringArray.add("테스트 스트링 데이터3");
		stringArray.add("테스트 스트링 데이터4");
		stringArray.add("테스트 스트링 데이터5");
		stringArray.add("테스트 스트링 데이터6");
		stringArray.add("테스트 스트링 데이터7");
		stringArray.add("테스트 스트링 데이터8");
		stringArray.add("테스트 스트링 데이터9");
		rtnData.setStringArrays(stringArray);
		return rtnData;
	}

	
	public DbTestModel getApi2Data() {
		return testMapper.getApi2Data();
	}


	public List<DbTestCamelCaseModel> getApi3Data() {
		return testMapper.getApi3Data();
	}
}