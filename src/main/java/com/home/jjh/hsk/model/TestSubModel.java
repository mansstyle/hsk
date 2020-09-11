package com.home.jjh.hsk.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class TestSubModel{
	private final String subAttr1;
	private final String subAttr2;

	public TestSubModel(String subAttr1, String subAttr2) {
		this.subAttr1 = subAttr1;
		this.subAttr2 = subAttr2;
	}
}