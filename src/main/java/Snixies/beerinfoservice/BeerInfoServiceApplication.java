package Snixies.beerinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BeerInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeerInfoServiceApplication.class, args);
	}

}
