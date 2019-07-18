package team.Stark.zff.chapter1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping ("hello1")
    public String HelloWorld(){
        return "HelloWorld!!!!.";

    }
}
