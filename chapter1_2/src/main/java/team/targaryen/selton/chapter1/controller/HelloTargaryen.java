package team.targaryen.selton.chapter1.controller;

<<<<<<< HEAD
import org.springframework.web.bind.annotation.RestController;

public class HelloTargaryen {

=======
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTargaryen {

    @RequestMapping("seeGroupConfig")
    public String getGroupConfigValue() {
        return "I want to see the value of 'group'!";
    }

    @RequestMapping("seeCreaterConfig")
    public String getCreaterConfigValue() {
        return "I want to see the value of 'creater'!";
    }

    @RequestMapping("seeMessageConfig")
    public String getMessageConfigValue() {
        return "I want to see the value of 'message'!";
    }

>>>>>>> bc33d84df1c50e048cbbe316e2d7ce237a524620
}
