package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
    public String addUser(User user) {
        if (userRepo.existsById(user.getUsername())) {
            return "User with username already exists!";
        } else if (userRepo.findByEmailid(user.getEmailid()) != null) {
            return "User with email ID already exists!";
        }
        userRepo.save(user);
        return "User added successfully!";
    }

    public List<User> showAllUsers() {
        return userRepo.findAll();
    }

    public User searchUser(String usernameOrEmail) {
        User user = userRepo.findByUsername(usernameOrEmail);

        if (user == null) {
            user = userRepo.findByEmailid(usernameOrEmail);
        }

        return user;
    }

}
