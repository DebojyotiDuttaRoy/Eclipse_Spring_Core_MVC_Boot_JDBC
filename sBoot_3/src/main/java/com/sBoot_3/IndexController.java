package com.sBoot_3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
/*	import jakarta.servlet.http.HttpSession;
	import jakarta.servlet.http.HttpServletRequest;	
	import org.springframework.ui.Model;
	import java.util.HashMap;
	import java.util.Map;*/

@Controller
public class IndexController {
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
/*	@RequestMapping("/results")
	public String index(HttpServletRequest request) {
		System.out.println("Value : "+request.getParameter("value"));
		HttpSession session = request.getSession();
		session.setAttribute("value", request.getParameter("value"));
		return "results";
	}
	@RequestMapping("/results")
	public String index(@RequestParam("val") String value, HttpSession session) {
		System.out.println("Value : "+value);
		session.setAttribute("value", value);
		return "results";
	}
	@RequestMapping("/results")
	public String index(@RequestParam("val") String value, Model model) {
		model.addAttribute("value", value);
		return "results";
	}
	@RequestMapping("/results")
	public ModelAndView index(@RequestParam("val") String data) {
		Map<String, String> map= new HashMap<String, String>();
		map.put("value", data);
		return new ModelAndView("results", map);
	}	*/
	@RequestMapping("/results")
	public ModelAndView index(@RequestParam("val") String data) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("value", data);
		return mv;
	}
}
