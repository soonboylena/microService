package com.yushi.sunb;

import com.yushi.sunb.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication
public class EightZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(EightZuulApplication.class, args);
	}

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
