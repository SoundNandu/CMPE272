package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	// ------------ Retrieve all reservations ------------
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public List getAllUsers() {
		return userService.getAllUsers();
		
	}
	
	// ------------ Retrieve a reservation ------------
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public Users getUsers(@PathVariable String id) {
		return userService.getUsers(id);
	}
	
	// ------------ Create a reservation ------------
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public void addUsers(@RequestBody Users user ) {
		userService.addUsers(user);
		
	}
	
	// ------------ Update a reservation ------------
	@RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
	public void updateUsers(@RequestBody Users user,@PathVariable Long id) {
		userService.updateUsers(id, user);
	}
	
	// ------------ Delete a reservation ------------
	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public void deleteUsers(@PathVariable String id) {
		userService.deleteUsers(id);
	}


}
