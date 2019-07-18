package team.array.xilpikachu.chapter1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvironmentController {

    @Autowired
    private Environment environment;

    @RequestMapping("seeGroupConfig2")
    public String seeGroupConfig() {
        return environment.getProperty("group");
    }
    @RequestMapping("seeCreaterConfig2")
    public String seeCreaterConfig() {
        return environment.getProperty("creater");
    }
    @RequestMapping("seeMessageConfig2")
    public String seeMessageConfig() {
        return environment.getProperty("message");
    }
}
