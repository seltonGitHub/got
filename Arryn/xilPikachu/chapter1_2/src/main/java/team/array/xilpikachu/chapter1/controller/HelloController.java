package team.array.xilpikachu.chapter1.controller;

import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${group}")
    private String group;
    @Value("${creater}")
    private String creater;
    @Value("${message}")
    private String message;

    @RequestMapping("hello")
    public String hello() {
        return "hello world";
    }

    @RequestMapping("seeGroupConfig")
    public String seeGroupConfig() {
        return group;
    }
    @RequestMapping("seeCreaterConfig")
    public String seeCreaterConfig() {
        return creater;
    }
    @RequestMapping("seeMessageConfig")
    public String seeMessageConfig() {
        return message;
    }
}
