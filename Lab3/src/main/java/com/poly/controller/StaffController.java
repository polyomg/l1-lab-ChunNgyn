package com.poly.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poly.entity.Staff;

@Controller
public class StaffController {
	@RequestMapping("/lab3")
	public String lab3() {
		return "lab3";
	}
	@RequestMapping("/staff/detail")
	public String staff(Model model) {
		Staff staff = Staff.builder()
				.id("user@gmail.com")
				.fullname("nguyễn văn user")
				.level(2)
				.build();
		model.addAttribute("staff",staff);
		return "staff-detail";
	}
	@RequestMapping("/staff/list")
	public String list(Model model) {
		List<Staff> list = List.of(
				Staff.builder().id("user1@gmail.com").fullname("Nguyễn Văn User1").level(0).build(),
				Staff.builder().id("user2@gmail.com").fullname("Nguyễn Văn User2").level(1).build(),
				Staff.builder().id("user3@gmail.com").fullname("Nguyễn Văn User3").level(2).build(),
				Staff.builder().id("user4@gmail.com").fullname("Nguyễn Văn User4").level(2).build(),
				Staff.builder().id("user5@gmail.com").fullname("Nguyễn Văn User5").level(1).build(),
				Staff.builder().id("user6@gmail.com").fullname("Nguyễn Văn User6").level(0).build());
		model.addAttribute("list",list);
		return "staff-list";
	}
	@RequestMapping("/staff/status")
	public String status(Model model) {
		List<Staff> list = List.of(
				Staff.builder().id("user1@gmail.com").fullname("Nguyễn Văn User1").level(0).build(),
				Staff.builder().id("user2@gmail.com").fullname("Nguyễn Văn User2").level(1).build(),
				Staff.builder().id("user3@gmail.com").fullname("Nguyễn Văn User3").level(2).build(),
				Staff.builder().id("user4@gmail.com").fullname("Nguyễn Văn User4").level(2).build(),
				Staff.builder().id("user5@gmail.com").fullname("Nguyễn Văn User5").level(1).build(),
				Staff.builder().id("user6@gmail.com").fullname("Nguyễn Văn User6").level(0).build());
		model.addAttribute("list",list);
		return "staff-status";
	}
	@RequestMapping("/staff/control")
	public String control(Model model) {
		List<Staff> list = List.of(
				Staff.builder().id("user1@gmail.com").fullname("Nguyễn Văn User1").level(0).build(),
				Staff.builder().id("user2@gmail.com").fullname("Nguyễn Văn User2").level(1).build(),
				Staff.builder().id("user3@gmail.com").fullname("Nguyễn Văn User3").level(2).build(),
				Staff.builder().id("user4@gmail.com").fullname("Nguyễn Văn User4").level(2).build(),
				Staff.builder().id("user5@gmail.com").fullname("Nguyễn Văn User5").level(1).build(),
				Staff.builder().id("user6@gmail.com").fullname("Nguyễn Văn User6").level(0).build());
		model.addAttribute("list",list);
		return "list-controls";
	}
}
