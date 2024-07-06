package com.example.RESTAPIS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.RESTAPIS.entity.User;
import com.example.RESTAPIS.repository.UserRepository;

import java.util.List;

@RestController
public class UserController {
	
	@Autowired
	UserRepository repo;
	
	
	// get all the users 
	// localhost :8080/users
	
	@GetMapping("/users")
	public List<User> getAllUsers() 
	{
		List <User>users = repo.findAll();
		
		return users;
		
	}
	
	//localhost : 8080/users/1
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable int id)
	{
		 User user =repo.findById(id).get()	;
		 
		 return user;
	}
	
	@PostMapping("/user/add")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User newUser = repo.save(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
		
	}
	
@PutMapping("/user/update/{id}")
public User updateUsers(@PathVariable int id) {
  User user = repo.findById(id).get();
   user.setName("poonam");
   user.setId(92);
   repo.save(user);
   return user;
	
}
@DeleteMapping("/user/delete/{id}")
@ResponseStatus(code = HttpStatus.NO_CONTENT)
public void removeUsers(@PathVariable int id) {
	User user = repo.findById(id).get();
	repo.delete(user);
}
}
	