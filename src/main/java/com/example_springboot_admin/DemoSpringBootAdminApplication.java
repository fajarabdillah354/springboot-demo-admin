package com.example_springboot_admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableAdminServer
@SpringBootApplication
public class DemoSpringBootAdminApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootAdminApplication.class, args);
	}

}
