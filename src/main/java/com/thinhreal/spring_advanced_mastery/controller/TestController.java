package com.thinhreal.spring_advanced_mastery.controller;

import com.extra.hidden.HiddenService;
import com.thinhreal.spring_advanced_mastery.config.CustomFeature;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final HiddenService hiddenService;
    //constructor
    public TestController(HiddenService hiddenService) {
        this.hiddenService = hiddenService;
    }

    @GetMapping("/scan-test")
    public String scanTest() {
        return hiddenService.findMe();
    }
}
