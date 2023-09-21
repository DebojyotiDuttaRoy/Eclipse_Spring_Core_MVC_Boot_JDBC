package com.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/veg")
public class VegChef {
	@ResponseBody
	@RequestMapping("/getFood")
/*	@RequestMapping("/hello")
	public String helloWorld() {		*/
	public String prepareFood(@RequestParam("orderId") int idv) {
		return"<h1>Your veg food is ready !! and your Order Id is = "+idv+"</h1>";
		//return"Hello My First Web !!";
	}
}
//INFO: FrameworkServlet 'waiter': initialization completed in 2387 ms
