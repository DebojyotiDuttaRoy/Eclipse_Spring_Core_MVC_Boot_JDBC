package com.shop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/*	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.ResponseBody;	*/

@Controller
@RequestMapping("/nonveg")
public class NonVegChef {
	//@ResponseBody
	@RequestMapping("/getFood")
	public String prepareFood(Model model) {
/* public String prepareFood(@RequestParam("orderId") int idn) {
		return"<h1>Your non-veg food is ready !! and your Order Id is = "+idn+"</h1>";
		return"/WEB-INF/jsp/preparedFood.jsp";
		return"/WEB-INF/jsp/preparedFood.html";	*/
		String msg ="Your food (non-veg) is ready !!";
		int orderId=2108;
		String CustName = "Aditi";
		model.addAttribute("message", msg);
		model.addAttribute("id", orderId);
		model.addAttribute("name", CustName);
		return"preparedFood";
	}
}
