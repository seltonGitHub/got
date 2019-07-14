package team.tyrell.lfc.chapter1;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
      @RequestMapping("hello")
    public String hello(){
          return "hello world!";
      }
}
