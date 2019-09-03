package com.montes.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Calculator RestController
 */
@RestController
public class CalculatorController {

    @Autowired
    private Calculator calculator;

    @RequestMapping("/sum")
    String sum(@RequestParam Integer a, @RequestParam Integer b) {
        return String.valueOf(calculator.sum(a,b));
    }

}
