package com.yushi.sunb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SixConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SixConfigApplication.class, args);
	}
}
