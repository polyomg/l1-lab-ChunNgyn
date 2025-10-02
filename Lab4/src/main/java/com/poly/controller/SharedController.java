package com.poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class SharedController {
	@RequestMapping("/home/index")
	public String home(Model model) {
		return "/home/index";
	}
	@RequestMapping("/home/about")
	public String about(Model model) {
		return "/home/about";
	}
}
