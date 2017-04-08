package com.piggsoft.simon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@SpringBootApplication
@EnableOAuth2Sso
public class SimonApplication {

	@RequestMapping("/user")
	public Principal user(Principal principal) {
		return principal;
	}

	public static void main(String[] args) {
		SpringApplication.run(SimonApplication.class, args);
	}
}
