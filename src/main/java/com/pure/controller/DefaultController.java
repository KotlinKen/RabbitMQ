package com.pure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
	@GetMapping("/")
	public String getRooter() {
		return "root";	}
	

}
