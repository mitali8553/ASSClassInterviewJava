package com.example.Assignment.Assign.control;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Assignment.Assign.model.User;
import com.example.Assignment.Assign.repo.UserRepository;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/users")
public class UserController {
	
	private final UserRepository userRepository;

	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	

	@PostMapping
	public User createUser(@RequestBody @Valid User user) {
		return userRepository.save(user);
	}
	
	@GetMapping
	public List<User> getAllUsers() {
		return userRepository.findAll();
		
	}
	

}
