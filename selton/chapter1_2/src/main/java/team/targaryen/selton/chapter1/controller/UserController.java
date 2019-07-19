package team.targaryen.selton.chapter1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import team.targaryen.selton.chapter1.VO.ResponseInfo;
import team.targaryen.selton.chapter1.entity.User;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("user")
@Slf4j
public class UserController {

    private static Map<Long, User> userIdAndUserMap = new HashMap<>();

    //当访问这个接口时 这块代码将会抛出名为 Exception 的异常  并携带着一些异常信息 也就是 a exception occur
    //这个异常会被我们的异常捕获器捕捉到 也就是将会跳转到 GlobalExceptionHandler 的 jsonErrorHandler中处理
    @GetMapping("{id}")
    public User getUserByName(@PathVariable("id") long id) throws Exception {
        throw new Exception("a exception occur");
    }

    @PostMapping("add")
    public ResponseInfo addUser(User user) {
        log.debug("this is debug log : addUser user {}", user);
        log.info("this is info log: addUser user {}", user);
        // save user
        return new ResponseInfo();
    }

    @DeleteMapping("{id}")
    public int removeUser(@PathVariable("id") long id) {
        //成功删除的用户数量
        int successRemoveNum = 0;

        // remove user

        return successRemoveNum;
    }

    @PutMapping("{id}")
    public int modifyUser(User user) {
        //成功修改的用户数量
        int successRemoveNum = 0;

       // modify user

       return successRemoveNum;
    }
}
