package com.jvmitenas.accounts;

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
		title = "Accounts Microservice REST API Documentation",
		description = "ItenasBank Accounts Microservice REST API Documentation",
		version = "v1",
		contact = @Contact(
			name = "Kurnia Ramadhan Putra",
			email = "instructor@jvmitenas.com",
			url = "https://www.linkedin.com/in/kurniaramadhanputra/"
		),
		license = @License(
			name = "Apache 2.0",
			url = "https://jvmitenas.com"
		)
	),
	externalDocs = @ExternalDocumentation(
		description = "ItenasBank Accounts Microservice REST API Documentation",
		url = "https://jvmitenas.com/swagger-ui.html"
	)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
