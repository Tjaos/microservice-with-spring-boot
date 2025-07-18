package br.com.thiagoamaral.order_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

}

@RestController
@RequestMapping("order")
class OrderController {

	@RequestMapping
	public String getOrder() {
		return "Order Service is running!";
	}
}
