package com.thinhreal.spring_advanced_mastery.controller;

import com.extra.hidden.HiddenService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final HiddenService hiddenService;
    public TestController(HiddenService hiddenService){
        this.hiddenService = hiddenService;
    }
}
