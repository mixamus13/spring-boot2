package com.example.springboot.autowired;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Macbook implements Price {
    @Override
    public String getPrice() {
        log.info("Get price for Macbook");
        return "160_000_RUB";
    }
}
