package com.globant.bootcamp.shoppingcart;

import com.globant.bootcamp.shoppingcart.service.ProductService;
import com.globant.bootcamp.shoppingcart.service.ProductServiceInMem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShoppingCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartApplication.class, args);
	}

	@Bean
	public ProductService getProductService() {
		return new ProductServiceInMem();
	}
}
