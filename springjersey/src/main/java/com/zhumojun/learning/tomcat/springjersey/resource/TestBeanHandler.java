package com.zhumojun.learning.tomcat.springjersey.resource;

public class TestBeanHandler {
	private static TestBean testBean;

	public static TestBean getTestBean() {
		return testBean;
	}

	public static void setTestBean(TestBean testBean) {
		TestBeanHandler.testBean = testBean;
	}
}
