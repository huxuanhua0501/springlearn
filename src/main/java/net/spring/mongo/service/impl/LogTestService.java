package net.spring.mongo.service.impl;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import net.spring.mongo.pojo.LogTest;
import net.spring.mongo.service.ILogTestSerice;
import net.spring.mongo.service.IRespositoryservice;

 

@Service
public class LogTestService implements ILogTestSerice {

	@Resource
	protected MongoTemplate mongoTemplate;
	
	@Autowired
	IRespositoryservice respositoryservice;

	@Override
	public void saveLogTest(String testName) {
		// TODO Auto-generated method stub
		try {
		Date startDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String startDateStr = sdf.format(startDate);
		Date createTimes;
			createTimes = sdf.parse(startDateStr);
		LogTest log = new LogTest();
		log.setName("sdfsf");
		log.setPassword("sfdsf");
 		mongoTemplate.insert(log);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
	}
	 

	public static void main(String[] args) {
		LogTestService l = new LogTestService();
		String testName ="你妹";
		 l.saveLogTest(testName);
	}


	@Override
	public LogTest find(String testName) {
		// TODO Auto-generated method stub
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is("test"));
		List<LogTest>list = mongoTemplate.find(query, LogTest.class);
		return list.get(0);
	}
	
	
	public List<LogTest> findR(String name){
//		return null;
	 return	respositoryservice.findAll();
	}
}
