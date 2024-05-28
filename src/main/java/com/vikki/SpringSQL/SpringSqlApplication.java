package com.vikki.SpringSQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpringSqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSqlApplication.class, args);
	}

}
