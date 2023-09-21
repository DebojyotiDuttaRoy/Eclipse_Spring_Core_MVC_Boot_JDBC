package com.sBootApp;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.sBootApp.dao.UserRepo;
//import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class DataApi {
	@Autowired
	UserRepo repo;
	
	@RequestMapping("/getAllUserDetails")
	public List<UserRegistration> getAllData() {
		//System.out.println("Operation is successfully performed on the database");
		return repo.findAll();
	}
	//@RequestMapping("/getUserById/{uid}")
	//@PostMapping("/getUserById/{uid}")
	@RequestMapping(method = RequestMethod.POST, value = "/getUserById/{uid}")
	public Optional<UserRegistration> getRecordById(@PathVariable("uid") Long Id ) {
		return repo.findById(Id);
	}
}
