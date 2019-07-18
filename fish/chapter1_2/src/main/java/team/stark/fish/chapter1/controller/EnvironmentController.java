package team.stark.fish.chapter1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvironmentController {

    @Autowired
    private Environment environment;

    @RequestMapping("seeGroupConfig1")
    public String getGroupConfigValue(){
        return environment.getProperty("group");
    }

    @RequestMapping("seeCreaterConfig1")
    public String getCreaterConfigValue(){
        return environment.getProperty("creater");
    }

    @RequestMapping("seeMessageConfig1")
    public String getMessageConfigValue(){
        return environment.getProperty("message");
    }
}
