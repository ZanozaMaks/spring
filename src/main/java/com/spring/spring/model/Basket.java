package com.spring.spring.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@SessionScope
public class Basket {

    public Map<Integer, Integer> iD = new HashMap<>();

    public List<Integer> add(List<Integer> identifiers) {
        for (Integer i : identifiers) {
            if (iD.containsKey(i)) {
                iD.put(i, iD.get(i) + 1);
            } else {
                iD.put(i, 1);
            }
        }
        return identifiers;
    }

    public Map<Integer, Integer> get() {
        return iD;
    }
}