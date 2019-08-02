package team.targaryen.selton.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("client-hi")
public interface SchedualServiceHi {
    @GetMapping("hi")
    String sayHiFromClientOne(@RequestParam("name") String name);
}
