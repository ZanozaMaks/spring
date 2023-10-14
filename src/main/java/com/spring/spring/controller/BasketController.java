package com.spring.spring.controller;

import com.spring.spring.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;
import java.util.Map;

@SessionScope
@RestController
@RequestMapping ("/order")
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public List<Integer> add(@RequestParam List<Integer> identifiers) {
        return basketService.add(identifiers);
    }

    @GetMapping("/get")
    public Map<Integer, Integer> get() {
        return basketService.get();
    }
}
