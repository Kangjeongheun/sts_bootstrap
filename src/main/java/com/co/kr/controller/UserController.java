package com.co.kr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j 
@RequestMapping(value = "/")
public class UserController {

	
	@GetMapping("/")
	public String index(){
		return "index.html";
	}
	
	@GetMapping("/about")
	public String about(){
		return "about.html";
	}
	
	@GetMapping("/contact")
	public String contact(){
		return "contact.html";
	}
	
	@GetMapping("/pricing")
	public String pricing(){
		return "pricing.html";
	}
	
	
}