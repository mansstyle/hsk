package com.home.jjh.hsk.controller;

import java.util.List;

import com.home.jjh.hsk.model.DbTestCamelCaseModel;
import com.home.jjh.hsk.model.DbTestModel;
import com.home.jjh.hsk.model.TestModel;
import com.home.jjh.hsk.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private TestService testService;

	/**
	 * 접속테스트
	 * @return
	 */
	@RequestMapping(value = "/")
	public String test() {
		return "This is main page.";
	}

	/**
	 * API 데이터출력 테스트
	 * @return
	 */
	@RequestMapping(value = "/test1")
	public TestModel testApi() {
		return testService.getApi1Data();
	}

	/**
	 * DB에서 단순데이터 조회하여 출력
	 * @return
	 */
	@RequestMapping(value = "/test2")
	public DbTestModel testApi2() {
		return testService.getApi2Data();
	}


	/**
	 * DB 에서 데이터조회 / 리스트형 출력 / mybatis 칼럼매칭 camelcase 확인용
	 * @return
	 */
	@RequestMapping(value = "/test3")
	public List<DbTestCamelCaseModel> testApi3() {
		return testService.getApi3Data();
	}
}