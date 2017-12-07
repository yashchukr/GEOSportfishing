package com.geosportfishing.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.geosportfishing"})
@EntityScan(basePackages = {"com.geosportfishing"})
@ComponentScan(basePackages = {"com.geosportfishing"})
@PropertySource("classpath:application.properties")

public class GeoSportfishingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeoSportfishingApplication.class, args);
	}
}
