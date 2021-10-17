package com.example.springboot.autowired;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Iphone implements Price {
    @Override
    public String getPrice() {
        log.info("Get price for Iphone");
        return "55_000_RUB";
    }
}
