package com.thinhreal.spring_advanced_mastery.controller;

import com.thinhreal.spring_advanced_mastery.config.CustomFeature;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final CustomFeature customFeature;

    public TestController(CustomFeature customFeature){
        this.customFeature = customFeature;
    }

    @GetMapping("/test-manual")
    public String testManual() {
        return customFeature.getInfo();
    }
}
