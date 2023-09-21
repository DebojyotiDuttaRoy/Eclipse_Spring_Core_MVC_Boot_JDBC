package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
/*	@ResponseBody
	 //@RequestMapping("/login")
	@RequestMapping("/")
	public String login(Model m) {
		m.addAttribute("objUser", new UserLogin());
		return "login";
	}	*/
	@RequestMapping("/")
	public String login(@ModelAttribute("objUser") UserLogin user) {
		return "login";
	}	
/*	 @RequestMapping("/Login-panel")
  	//public String home(String userName, String userPassword, Model model){
   	//public String home(@RequestParam("userName")  String uname, @RequestParam("userPassword") String upass, Model model) {
	public String home(UserLogin login, Model model) {
		System.out.println("user-name : "+uname);
		System.out.println("user-password : "+upass);	 */
	@RequestMapping("/Login-panel")
	public String home(@ModelAttribute("objUser") UserLogin login, Model model, @RequestParam("action") String click) {
		System.out.println(click);
		if(click.equalsIgnoreCase("Login")) {
/*			System.out.println("user-name : " + login.getUserName());
			System.out.println("user-password : " + login.getUserPassword());
			// get data from DB	 */
			if (login.getUserName().equalsIgnoreCase("Titas") && login.getUserPassword().equals("69")) {		
				System.out.println("*****Home Page*****");
/*				model.addAttribute("uname", login.getUserName());
				model.addAttribute("upass", login.getUserPassword());
				model.addAttribute("user", login);	 */
				return "home";
			}
			else {
				model.addAttribute("msg", "Error : Invalid Input!!");
				return "login";
			}
		}
		else if(click.equalsIgnoreCase("Register Now")) {
			return "redirect:/registration";
		}
		return "login";
		//return "home";
	}
}
