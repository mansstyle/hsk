package com.home.jjh.hsk.service;

import java.util.ArrayList;
import java.util.List;

import com.home.jjh.hsk.mapper.SelectMapper;
import com.home.jjh.hsk.mapper.TestMapper;
import com.home.jjh.hsk.mapper.InsertMapper;
import com.home.jjh.hsk.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class TestService {

	@Autowired
	private TestMapper testMapper;
	@Autowired
	private InsertMapper insertMapper;
	@Autowired
	private SelectMapper selectMapper;


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

	public DbTestModel getApi2Data() {return testMapper.getApi2Data();}
	public List<DbTestCamelCaseModel> getApi3Data() {return testMapper.getApi3Data();}

	public List<user> getApiUser(@RequestParam("email") String email){return selectMapper.getApiUser(email);}


	public void setApiUser(user user){insertMapper.setApiUser(user);}
	public void setApiMain_banner_item(main_banner_item main_banner_item){insertMapper.setApiMain_banner_item(main_banner_item) ;}
	public void inserShop (shopsModel shopsModel){insertMapper.insertShop(shopsModel);}
	public void insertNewItem (itemModel itemModel){insertMapper.insertNewItem(itemModel);}
	public void insertItemDetail (itemDetailModel itemDetailModel){insertMapper.insertItemDetail(itemDetailModel);}
	public void insertEvent (eventModel eventModel){insertMapper.insertEvent(eventModel);}

}