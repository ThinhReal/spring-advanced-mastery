package com.thinhreal.spring_advanced_mastery.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class LifecycleDemoBean {
    public LifecycleDemoBean(){
        System.out.println("Bean is being instantiated");
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean is fully initialized and ready to use");
    }

    @PreDestroy
    public void cleanup(){
        System.out.println("Spring is closing, clean up resources");
    }
}
