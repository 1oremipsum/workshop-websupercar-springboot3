package com.websupercar.supercar.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.websupercar.supercar.entities.User;
import com.websupercar.supercar.entities.enums.OrderStatus;
import com.websupercar.supercar.entities.Category;
import com.websupercar.supercar.entities.Order;
import com.websupercar.supercar.entities.OrderItem;
import com.websupercar.supercar.entities.Product;
import com.websupercar.supercar.repositories.CategoryRepository;
import com.websupercar.supercar.repositories.OrderItemRepository;
import com.websupercar.supercar.repositories.OrderRepository;
import com.websupercar.supercar.repositories.ProductRepository;
import com.websupercar.supercar.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private OrderItemRepository orderItemRepository;

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(null, "Car's pieces"); 
		Category cat2 = new Category(null, "Utilities"); 
		Category cat3 = new Category(null, "Tools");

		Product p1 = new Product(null, "BOLT EUV bumper 2023/2023",
		"BOLT EUV bumper 2023/2023 chevrolet", 400.0);
		p1.getCategories().add(cat1);

		Product p2 = new Product(null, "MOBIL SUPER 15W-40 SEMI-SYSTEMIC", 
		"Passenger cars, SUVs and trucks running on gasoline, ethanol and CNG", 20.0);
		p2.getCategories().add(cat2);
		
		Product p3 = new Product(null, "25Ton Nail Type Industrial Hydraulic Jack - MIU25000",
		"The upper head also serves as a lifting base.", 300.0);
		p3.getCategories().add(cat2);
		p3.getCategories().add(cat3);

		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "mb3452", "988888888");
		User u2 = new User(null, "Alex Grey", "alex@gmail.com", "al5692", "977777777");

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1); 
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2); 
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

		OrderItem oi1 = new OrderItem(o1, p1, 1, p1.getPrice());
		OrderItem oi4 = new OrderItem(o1, p2, 1, p2.getPrice());
		OrderItem oi2 = new OrderItem(o2, p2, 2, p2.getPrice());
		OrderItem oi3 = new OrderItem(o3, p3, 1, p3.getPrice());

		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		productRepository.saveAll(Arrays.asList(p1, p2, p3));
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		orderItemRepository.saveAll(Arrays.asList(oi1, oi2, oi3, oi4));
	}
}
