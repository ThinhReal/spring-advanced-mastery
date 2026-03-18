package com.thinhreal.spring_advanced_mastery.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public CustomFeature customFeature() {
        return new CustomFeature();
    }
}
