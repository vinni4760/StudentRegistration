package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.model.Laptop;
import com.nt.service.IService;

@Controller
@RequestMapping("/laptop")
public class LaptopController {
	@Autowired
	private IService service;

	@RequestMapping("/register")
	 public String showHome() {
		 return "home";
	 }
	
	@PostMapping("register")
	public String registLaptop(Map<String, Object> map,@ModelAttribute("laptop") Laptop laptop) {
		service.registerLaptop(laptop);
		map.put("val1", laptop.getId());
		return "result";
	}
}
