package com.thinhreal.spring_advanced_mastery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// add scanBasePackages here
@SpringBootApplication(scanBasePackages = {
		"com.thinhreal.spring_advanced_mastery",
		"com.extra.hidden"
})
public class AppConfig {

	public static void main(String[] args) {
		SpringApplication.run(AppConfig.class, args);
	}

}
