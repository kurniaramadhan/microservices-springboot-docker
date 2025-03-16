package com.jvmitenas.cards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
	info = @Info(
			title = "Cards microservice REST API Documentation",
			description = "ItenasBank Cards microservice REST API Documentation",
			version = "v1",
			contact = @Contact(
				name = "Kurnia Ramadhan Putra",
				email = "instructor@jvmitenas.com",
				url = "https://www.linkedin.com/in/kurniaramadhanputra/"
			),
			license = @License(
				name = "Apache 2.0",
				url = "https://www.jvmitenas.com"
			)
	),
	externalDocs = @ExternalDocumentation(
		description = "ItenasBank Cards microservice REST API Documentation",
		url = "https://www.jvmitenas.com/swagger-ui.html"
	)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}

}
