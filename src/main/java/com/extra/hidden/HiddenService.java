package com.extra.hidden;

import org.springframework.stereotype.Service;

@Service
public class HiddenService {
    public String findMe(){
        return "You found the hidden Service using @ComponentScan !";
    }
}
