package com.spring.spring.controller;

import com.spring.spring.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/order")
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public List<Integer>add(@RequestParam List<Integer> identifiers) {
        return basketService.add(identifiers);
    }

    @GetMapping("/get")
    public List<Integer>get() {
        return basketService.get();
    }
}
