package com.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/nonveg")
public class Chef2 {
	@ResponseBody
	@RequestMapping("/getFood")
	public String prepareFood(@RequestParam("orderId") int idn) {
		return"<h1>Your non-veg food is ready !! and your Order Id is = "+idn+"</h1>";
	}
}
