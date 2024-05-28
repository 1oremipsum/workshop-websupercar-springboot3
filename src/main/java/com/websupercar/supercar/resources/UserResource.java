package com.websupercar.supercar.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.websupercar.supercar.entities.User;

@RestController
@RequestMapping(value = "/user")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> userRequestTest(){
		return ResponseEntity.ok().body(new User
				(1L, "Allan", "allan@gmail.com", "1grupochonps", "99 9999-9999"));
	}
}
