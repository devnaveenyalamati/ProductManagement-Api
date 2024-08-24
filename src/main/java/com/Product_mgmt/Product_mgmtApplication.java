package com.Product_mgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Product_mgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(Product_mgmtApplication.class, args);
	}

}
