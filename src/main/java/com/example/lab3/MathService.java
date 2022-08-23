package com.example.lab3;

import org.springframework.web.bind.annotation.*;

@RestController
public class MathService {
    @RequestMapping(value = "/add/{num1}/{num2}", method = RequestMethod.GET)
    public String add(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2){
        double total = num1+num2;
        String totalString = String.valueOf(total);
        return totalString;
    }
    @RequestMapping(value = "/minus/{num1}/{num2}", method = RequestMethod.GET)
    public String minus(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2){
        double total = num1-num2;
        String totalString = String.valueOf(total);
        return totalString;
    }
    @RequestMapping(value = "/multiply", method = RequestMethod.GET)
    public String multiply(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2){
        double total = num1*num2;
        String totalString = String.valueOf(total);
        return totalString;
    }
    @RequestMapping(value = "/divide", method = RequestMethod.GET)
    public String divide(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2){
        double total = num1/num2;
        String totalString = String.valueOf(total);
        return totalString;
    }
}
