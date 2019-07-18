package team.stark.fish.chapter1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("group")
    private String group;
    @Value("creater")
    private String creater;
    @Value("message")
    private String message;

    @RequestMapping("seeGroupConfig")
    public String getGroupConfigValue(){
        return group;
    }

    @RequestMapping("seeCreaterConfig")
    public String getCreaterConfigValue(){
        return group;
    }

    @RequestMapping("seeMessageConfig")
    public String getMessageConfigValue(){
        return message;
    }
}
