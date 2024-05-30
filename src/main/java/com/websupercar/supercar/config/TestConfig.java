package com.websupercar.supercar.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.websupercar.supercar.entities.User;
import com.websupercar.supercar.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "mb3452", "988888888");
		User u2 = new User(null, "Alex Grey", "alex@gmail.com", "al5692", "977777777");
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
