package com.calc.math;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultController {

    @GetMapping("/result")
    Result result(@RequestParam(defaultValue = "1") long n1, @RequestParam(defaultValue = "1") long n2)
    {
        return new Result(n1, n2);
    }

}
