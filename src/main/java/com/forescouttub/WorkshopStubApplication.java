package com.forescouttub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@Import({WorkshopConfig.class, Wr.class})

@EnableWebSecurity
public class WorkshopStubApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkshopStubApplication.class, args);
	}

}
