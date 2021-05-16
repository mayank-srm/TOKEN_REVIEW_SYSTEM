package com.TokenReviewSystem.controller;

import com.TokenReviewSystem.model.UserloginData;
import com.TokenReviewSystem.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/TRS")
public class Usercontroller {

	
	
	@Autowired
	UserServices services;
	
	@RequestMapping("/getuserdata")
	public ResponseEntity<List<UserloginData>> alldata(){
		return services.getAlluaerdata();
	}

	@PostMapping("/AddUser")
	public ResponseEntity<UserloginData> userlog(@RequestBody UserloginData userlog) {
		
		return services.signinuser(userlog);
	}
	
	@GetMapping("/Login/{email}/{password}/{customertype}")
	public ResponseEntity<UserloginData> logindata(@PathVariable("email") String emailID,
			@PathVariable("password") String password,@PathVariable("customertype") String customertype){
	
		return services.login(emailID,password,customertype);
	}
}
