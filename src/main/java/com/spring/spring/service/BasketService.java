package com.spring.spring.service;


import com.spring.spring.model.Basket;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;
import java.util.Map;

@Service
@SessionScope
public class BasketService {

    private final Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }

    public List<Integer> add(List<Integer> identifiers) {
        return basket.add(identifiers);
    }

    public Map<Integer,Integer> get() {
        return basket.get();
    }
}
