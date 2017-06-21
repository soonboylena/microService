package com.yushi.sunb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EightServerBApplication {

	public static void main(String[] args) {
		SpringApplication.run(EightServerBApplication.class, args);
	}
}
