package com.thinhreal.spring_advanced_mastery.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.extra.hidden")
public class ExternalScanConfig {
    // No code is normal, cause its job is to hold the sign @ComponentScan
}
