package com.thinhreal.spring_advanced_mastery.controller;

import com.thinhreal.spring_advanced_mastery.config.CustomContact;
import com.thinhreal.spring_advanced_mastery.config.CustomFeature;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final CustomFeature customFeature;
    private final CustomContact customContact;
    // Call Setter to Inject Bean (setter-base injection)
    public TestController(CustomFeature customFeature, CustomContact customContact){

        this.customFeature = customFeature;
        this.customContact = customContact;
    }

    @GetMapping("/test-manual")
    public String testManual() {
        return customFeature.getInfo() + customContact.showContact();
    }
}
