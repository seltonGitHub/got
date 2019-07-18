package team.stark.allen.chapter1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "suprise  world";
    }

    @Autowired
    private Environment environment;


    @RequestMapping( "seeGroupConfig")
    public String groupLoads() {
        return  environment.getProperty("group");
    }

    @RequestMapping( "seeCreaterConfig")
    public String createrLoads() {
        return environment.getProperty("creater");
    }

    @RequestMapping( "seeMessageConfig")
    public String messageLoads() {
       return environment.getProperty("message");
    }

}
