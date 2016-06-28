package net.spring.mongo.service;

import net.spring.mongo.pojo.LogTest;

public interface ILogTestSerice {

	public void saveLogTest(String testName);
	public LogTest find(String testName);

}
