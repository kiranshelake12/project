package com.krn.Demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepository userrepository;
	
	public void saveinDatabase(User user) {
		userrepository.save(user);
	
		
	}

	
	}


