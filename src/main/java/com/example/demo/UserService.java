package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	// Retrieve all rows from table and populate list with objects
			public List getAllUsers() {
				
				List users = new ArrayList<>();
				userRepository.findAll().forEach(users::add);
				return users;
			}
			
			// Retrieves one row from table based on given id
			public Users getUsers(String id) {
				return userRepository.findById(id).orElse(null);
			
			}
			
			// Inserts row into table 
			public void addUsers(Users user) {
				userRepository.save(user);
			}
			
			// Updates row in table
			public void updateUsers(Long id, Users user) {
				userRepository.save(user);
			}
			
			// Removes row from table
			public void deleteUsers(String id) {
				userRepository.deleteById(id);;
			}

}
