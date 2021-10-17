package com.example.springboot.autowired;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy(value = false)
@Getter
@Slf4j
@Component
public class Shop {

    private final Price price;

    public Shop(@Qualifier("iphone") Price price) {
        log.info("create: " + price.getPrice());
        this.price = price;
    }
}
