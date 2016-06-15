package net.spring.one.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oneController")
public class OneController {

	@RequestMapping(value = "/getOne", method = { RequestMethod.GET, RequestMethod.POST })
	public String getOne() {
		return null;
	}
}
