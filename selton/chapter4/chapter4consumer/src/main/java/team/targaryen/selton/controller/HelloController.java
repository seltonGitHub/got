package team.targaryen.selton.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team.targaryen.selton.service.HelloConsumerService;

@RestController
public class HelloController {

    @Autowired
    private HelloConsumerService helloConsumerService;

    @GetMapping("hi")
    public String hi(@RequestParam String name) {
        return helloConsumerService.transferOuterService(name);
    }

}
