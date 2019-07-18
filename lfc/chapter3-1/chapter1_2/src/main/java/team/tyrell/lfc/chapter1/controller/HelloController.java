package team.tyrell.lfc.chapter1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
      @RequestMapping("hello")
    public String hello(){
          return "hello world!";
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