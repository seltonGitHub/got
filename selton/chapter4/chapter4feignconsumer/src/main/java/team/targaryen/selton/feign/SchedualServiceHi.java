package team.targaryen.selton.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import team.targaryen.selton.feign.impl.SchedualServiceHiHystric;

@FeignClient(value = "client-hi", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @GetMapping("hi")
    String sayHiFromClientOne(@RequestParam("name") String name);
}
