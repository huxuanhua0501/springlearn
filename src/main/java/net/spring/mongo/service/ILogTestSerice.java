package net.spring.mongo.service;

import java.util.List;

import net.spring.mongo.pojo.LogTest;

public interface ILogTestSerice {

	public void saveLogTest(String testName);
	public LogTest find(String testName);
	public List<LogTest> findR(String name);

}
