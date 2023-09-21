package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.service.UserService;

@Controller
public class UserRegController {
	@Autowired
	UserService service;
	
	@RequestMapping("/registration")
	//public String register(@ModelAttribute("objReg") UserRegDTO reg) {
	public ModelAndView register() {
		return new ModelAndView("register", "objReg", new UserRegDTO());
	}
	@ModelAttribute("countryList")
	public Map<String, String> countries(){
		//get countries from DB
		Map<String, String> map = new HashMap<String, String>();
		map.put("Canada", "Canada");
		map.put("USA", "USA");
		map.put("India", "India");
		map.put("China", "China");
		map.put("Singapore", "Singapore");
		return map;
	}
	@RequestMapping("/RegPros")
	public ModelAndView RegPros(@ModelAttribute("objReg") UserRegDTO user) {
		System.out.println(
				"\nName : "+user.getName()+
				"\nUser Name : "+user.getUserName()+
				"\nPassword : "+user.getPassword()+
				"\nCountery : "+user.getCountery()+
				"\nGender : "+user.getGender());
		if (service.registerUser(user)) {
			return new ModelAndView("login", "objUser", new UserLogin());
		}
		else {
		return new ModelAndView("register", "objReg", new UserRegDTO("Reg Failed!!"));
		}
	}
}
