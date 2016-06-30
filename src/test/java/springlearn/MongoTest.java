package springlearn;


 
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.spring.mongo.pojo.LogTest;
import net.spring.mongo.service.ILogTestSerice;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/applicationContext.xml" })
public class MongoTest {
	@Autowired
	private ILogTestSerice logTestService;
	
	
//	@Test
//	public void insert() {
// 
//		String testName = "你妹";
//		logTestService.saveLogTest(testName);
//	}
//	@Test
//	public void get() {
// 
//		String testName = "test";
//		LogTest log = new LogTest();
//		log = logTestService.find(testName);
//		System.out.println(log.getName()+"  "+log.getPassword());
//	}
	
	@Test
	public void getR() {
 
		 
		List<LogTest> list = logTestService.findR("");
		for(LogTest log:list){
			System.out.println(log.getName());
		}
	}	
	
	
	
	@Test
	public void getRF() {
 
		 
		 logTestService.findS();
		 
	}	
	
	
//	@Test
//	public void tt(){
//		System.err.println("sfsf");
//	}
}
