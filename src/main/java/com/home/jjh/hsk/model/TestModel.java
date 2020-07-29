package com.home.jjh.hsk.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter @Setter @ToString
public class TestModel{

	private String attr1;
	private String attr2;
	private List<String> stringArrays;
	private List<TestSubModel> dataArray;

}