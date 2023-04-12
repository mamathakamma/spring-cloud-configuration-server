package com.example.springcloud.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigurationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigurationServiceApplication.class, args);
	}
}
