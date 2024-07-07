package com.krn.Demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class RegisterController {
	@Autowired
	UserService userservice;
	
	@GetMapping("/register")
	public String getData(@ModelAttribute("UserData") User user) {
	//userservice.saveinDatabase(user);	
		return "register";
		
		

}
	@RequestMapping(value = "/register", method = RequestMethod.POST)  
    public String submitForm(@ModelAttribute("UserData")  User user)  
    {  

		userservice.saveinDatabase(user);
        return "register";  
    }

}

