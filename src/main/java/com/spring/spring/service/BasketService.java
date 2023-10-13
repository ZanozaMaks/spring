package com.spring.spring.service;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasketService {
    public List<Integer> items = new ArrayList<>();

    public List<Integer> add (List<Integer> identifiers) {
        items.addAll(identifiers);

        return identifiers;
    }

    public  List<Integer> get() {
        return items;
    }
}
