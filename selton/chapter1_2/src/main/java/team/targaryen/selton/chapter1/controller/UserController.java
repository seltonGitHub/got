package team.targaryen.selton.chapter1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import team.targaryen.selton.chapter1.VO.ResponseInfo;
import team.targaryen.selton.chapter1.entity.User;
import team.targaryen.selton.chapter1.service.IUserService;

@RestController
@RequestMapping("user")
@Slf4j
public class UserController {

    @Autowired
    private IUserService userService;

    //当访问这个接口时 这块代码将会抛出名为 Exception 的异常  并携带着一些异常信息 也就是 a exception occur
    //这个异常会被我们的异常捕获器捕捉到 也就是将会跳转到 GlobalExceptionHandler 的 jsonErrorHandler中处理
    @GetMapping("{id}")
    public User getUserByName(@PathVariable("id") long id) throws Exception {
        return userService.findById((int) id);
    }

    @PostMapping("add")
    @Transactional
    public ResponseInfo addUser(@RequestBody User user) {
        log.info("add user {}", user);
        int i = userService.addUser(user);
        log.info("success add {} user.", i);
        // save user
        return new ResponseInfo();
    }

    @DeleteMapping("{id}")
    public int removeUser(@PathVariable("id") long id) {
        //成功删除的用户数量
        int successRemoveNum = 0;

        // remove user
        userService.deleteById((int) id);

        return successRemoveNum;
    }

    @PutMapping("{id}")
    public int modifyUser(@PathVariable("id") int id, @RequestBody User user) {
        user.setId(id);
        //成功修改的用户数量
        int successRemoveNum = 0;

       // modify user
        userService.updateOne(user);

       return successRemoveNum;
    }
}
