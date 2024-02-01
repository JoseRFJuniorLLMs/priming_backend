package com.priming.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@ComponentScan({"com.priming.controller", "com.priming.service"})
@EntityScan("com.priming.entity")
@EnableNeo4jRepositories("com.priming.repository")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
