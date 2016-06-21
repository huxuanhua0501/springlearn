package net.spring.mq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.spring.mq.producer.queue.QueueSender;
import net.spring.mq.producer.topic.TopicSender;

@RestController
@RequestMapping("/mqController")
public class MqController {

	@Autowired QueueSender queueSender;
	@Autowired TopicSender topicSender;
	
	
	
	@RequestMapping(value = "queueSender", method={RequestMethod.GET,RequestMethod.POST})
	public String sendQueue(String message){
		String opt="";
		try {
			queueSender.send("test.queue", message);
			opt="suc";
		} catch (Exception e) {
			opt=e.getCause().toString();
		}
		return opt;
	}
	

	@RequestMapping(value="topicSender", method={RequestMethod.GET,RequestMethod.POST})
	public String topicSender(@RequestParam("message")String message){
		String opt="";
		try {
			topicSender.send("test.topic", message);
			opt="suc";
		} catch (Exception e) {
			opt=e.getCause().toString();
		}
		return opt;
	}
	
}
