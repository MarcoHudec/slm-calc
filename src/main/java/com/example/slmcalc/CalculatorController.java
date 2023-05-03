package com.example.slmcalc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalculatorController {

    @RequestMapping("/calc/sum")
    public int sum(@RequestParam int a, @RequestParam int b) //http://localhost:8080/calc/sum?a=3&b=5 setzt a =3 und b=5
    {
        return a+b;
    }

}
