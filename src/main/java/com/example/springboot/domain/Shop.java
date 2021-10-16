package com.example.springboot.domain;

import com.example.springboot.interfaces.Price;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Shop {

    private final Price price;

    public Shop(@Qualifier("iphone") Price price) {
        log.info("create: " + price.getPrice());
        this.price = price;
    }
}
