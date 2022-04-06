package com.shram.coding.user;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	@Autowired
	private UserDaoService service;

	@GetMapping(path = "/users")
	List<User> retrieveAllUsers() {
		return service.findAll();
	}

	@GetMapping(path = "/users/{id}")
	User retrieveUser(@PathVariable int id) {
		return service.findOne(id);
	}
}
