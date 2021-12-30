package com.clone.sns.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.clone.sns.controller.member.LoginController;
import com.clone.sns.controller.member.SignUpController;

@Configuration
public class ControllerConfig {
	@Bean
	public LoginController loginController() {
		return new LoginController();
	}
	@Bean
	public SignUpController signUpController() {
		return new SignUpController();
	}
}
