package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
    private String operation;
    private String x;
    private String y;

    @GetMapping("/map/calculate")
    public String getIndividualParams(@RequestParam String operation, @RequestParam String x @RequestParam String y){
        this.x = x;
        this.y = y;
        this.operation = operation;
    }

    public String add() {
        return x + y;
    }

    public String multiple() {
        return x * y;
    }

    public String subtract() {
        return x - y;
    }

    public String divide() {
        return x / y;
    }
}
