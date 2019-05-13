package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

	@Value("${user.role}")
	private String role;
	
	@Value("${user.password}")
	private String password;
	
/*    @Value("${user.password}")
    private String u1;

    @Value("${user.password}")
    private String u2;*/
	
	@RequestMapping(value="test/hi", method=RequestMethod.GET)
	public String requestMethodName() {
		return new String(role + "~~~~~" + password);
	}
}
