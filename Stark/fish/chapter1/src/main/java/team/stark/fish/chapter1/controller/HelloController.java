package team.stark.fish.chapter1.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//标明这个类将来用于网络请求 使得接下来的@RequestMapping 生效
public class HelloController {

    @RequestMapping("hello")//表示在将来的浏览器可以通过localhost:8080/hello 调用其中的方法
    public String helloToTheWorld(){
        return "hello world";
    }

}
