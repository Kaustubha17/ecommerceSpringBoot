package com.luv2code.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.luv2code")
@EntityScan("com.luv2code.entity")
@EnableJpaRepositories("com")
public class SpringBootEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEcommerceApplication.class, args); 
		}

}
