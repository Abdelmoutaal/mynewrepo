package com.accessingdatamysql.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, World";
	}

}