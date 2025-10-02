package com.poly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HCNCalcController {
	@Autowired
	HttpServletRequest req;
	
	@GetMapping("/form/hcn")
	public String form() {
		return "hcn";
	}
	@RequestMapping("/form/calc")
	public String calc(Model model) {
		Double cd = Double.parseDouble(req.getParameter("CD"));
		Double cr = Double.parseDouble(req.getParameter("CR"));
		model.addAttribute("cv", (cd+cr) *2);
		model.addAttribute("dt", cd * cr);
		return "hcn";
	}
}
