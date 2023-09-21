package com.sBootApp;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.sBootApp.dao.UserRepo;
import org.springframework.ui.ModelMap;

@Controller
public class RegistrationController {
	
	@Autowired
	UserRepo repo;
	
	@RequestMapping("/regform")
	public String register() {
		return "registration";
	}
/*	@RequestMapping("/userDetail")
	public ModelAndView userDetail(UserRegistration reg) {
	//public String userDetail(UserRegistration reg) {
		System.out.println("\nUser Name : "+reg.getUName()+"\nEmail ID : "+reg.getEmailId()+
				"\nPassword  : "+reg.getPassword()+"\nGender : "+reg.getGender()+"\nHobby : "+Arrays.toString(reg.getHobby()));
		ModelMap model=new ModelMap();
		model.addAttribute("name", reg.getUName());
		model.addAttribute("email", reg.getEmailId());
		model.addAttribute("pass", reg.getPassword());
		model.addAttribute("gender", reg.getGender());
		model.addAttribute("hobby", Arrays.toString(reg.getHobby()));
		//return "UserDetails";	
		ModelAndView mv = new ModelAndView("UserDetails");
		//mv.addObject("regObj", reg);
		mv.addObject("regObj", model);
		return mv;
	}	*/
	@RequestMapping("/operation")
	public ModelAndView operation(Long uid, String ddFlag) {
		if(ddFlag.equals("select")) {
			System.out.println(ddFlag);
			UserRegistration reg = repo.findById(uid).orElse(new UserRegistration());
			return SelectRec(reg);
		}else if(ddFlag.equals("delete")) {
			System.out.println(ddFlag);
			repo.deleteById(uid);
		}else if(ddFlag.equals("update")) {
			System.out.println(ddFlag);
			UserRegistration reg = repo.findById(uid).orElse(new UserRegistration());
			reg.setUName("Updated_Name");
			repo.save(reg);
		} else {
			System.out.println(ddFlag);
			//System.out.println(repo.findByUName("Debojyoti"));
			System.out.println(repo.selectRecordByUName("Debojyoti"));
			}
		return new ModelAndView("operation");
	}
	@RequestMapping("/userDetails")
	public String userInfo(UserRegistration reg) {
		repo.save(reg);
		return "operation";
	}
	@RequestMapping("/operationPage")
	public String operationPage() {
		return "operation";
	}
	public ModelAndView SelectRec(UserRegistration reg) {
			ModelMap model=new ModelMap();
			model.put("name", reg.getUName());
			model.put("email", reg.getEmailId());
			model.put("pass", reg.getPassword());
			model.put("gender", reg.getGender());
			model.put("hobby", Arrays.toString(reg.getHobby()));
			ModelAndView mv = new ModelAndView("UserDetails");
			mv.addObject("regObj", model);
			return mv;
	}
}
