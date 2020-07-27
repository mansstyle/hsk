package com.home.jjh.hsk.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class TestModel{

	private String attr1;
	private String attr2;
	private List<String> stringArrays;
	private List<TestSubModel> dataArray;

}