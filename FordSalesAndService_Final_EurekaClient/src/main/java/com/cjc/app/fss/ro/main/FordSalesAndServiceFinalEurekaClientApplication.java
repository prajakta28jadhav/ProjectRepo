package com.cjc.app.fss.ro.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@EnableJpaRepositories
@EntityScan
//@EnableEurekaClient
@SpringBootApplication
public class FordSalesAndServiceFinalEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FordSalesAndServiceFinalEurekaClientApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
