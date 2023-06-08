package com.driss.carinfo.testAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test/")
public class TestController {

    @GetMapping("helloWorld")
    public String getHelloWorld () {
        return "Hello World!";
    }
}
