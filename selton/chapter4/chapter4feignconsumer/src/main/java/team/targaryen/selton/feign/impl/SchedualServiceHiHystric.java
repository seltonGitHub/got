package team.targaryen.selton.feign.impl;

import org.springframework.stereotype.Component;
import team.targaryen.selton.feign.SchedualServiceHi;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "Sorry " + name;
    }
}
