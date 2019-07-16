package team.targaryen.selton.chapter1.controller;

import org.springframework.web.bind.annotation.*;
import team.targaryen.selton.chapter1.entity.User;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {

    private static Map<Long, User> userIdAndUserMap = new HashMap<>();

    @GetMapping("{id}")
    public User getUserByName(@PathVariable("id") long id) {
       return null;
    }

    @PostMapping("add")
    public String addUser(User user) {
        // save user
        return "ok";
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