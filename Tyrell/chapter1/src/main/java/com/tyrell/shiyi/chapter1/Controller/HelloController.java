package com.tyrell.shiyi.chapter1.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("hello")
    public String helloToTheWorld(){
        return "hello world.";
    }
}
