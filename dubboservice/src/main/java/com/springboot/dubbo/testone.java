package com.springboot.dubbo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fengli on 2018/3/16.
 */
@RestController
public class testone implements  ExampleService{

@GetMapping("/hi")
    @Override
    public String sayHi(@RequestParam String s) {
        return s;
    }
}
