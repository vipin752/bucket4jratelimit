package org.bucket.ratelimit.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Bucket4jRateLimitApp {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Bucket4jRateLimitApp.class)
				.properties("spring.config.location=classpath:ratelimiting/application-bucket4j-starter.yml")
				.run(args);
	}
}
