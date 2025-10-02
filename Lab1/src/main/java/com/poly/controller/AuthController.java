package com.poly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class AuthController {
	@Autowired
	HttpServletRequest req;
	
	@GetMapping("/login/form")
	public String form() {
		return "form";
	}
	@RequestMapping("/login/check")
	public String check(Model model) {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		if(username.equals("poly") && password.equals("123")) {
			model.addAttribute("message", "Đăng nhập thành công");
		} else {
			model.addAttribute("message", "Đăng nhập thất bại");
		}
		return "form";
	}
}
