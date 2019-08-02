package team.targaryen.selton.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import team.targaryen.selton.feign.SchedualServiceHi;

@RestController
public class HiController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @GetMapping("hi")
    public String sayHi(String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
