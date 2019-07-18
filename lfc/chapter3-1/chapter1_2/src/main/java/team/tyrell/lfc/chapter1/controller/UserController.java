package team.tyrell.lfc.chapter1.controller;

import org.springframework.web.bind.annotation.*;
import team.tyrell.lfc.chapter1.entity.User;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("user")
public class UserController {
    private static Map<Integer, User> userMap = new HashMap<>();

    @PostMapping("add")
    public String addUser(@RequestBody User user) {
        userMap.put(user.getId(), user);
        return "ok";
    }

    @GetMapping("{id}")
    public User userGetById(@PathVariable("id") int id) {
        User user = userMap.get(id);
        System.out.println("user = " + user);
        return userMap.get(id);
    }

    @DeleteMapping("{id}")
    public int removeUser(@PathVariable("id") int id) {
        //成功删除的用户数量
        int successRemoveNum = 0;
        userMap.remove(id);
        return ++successRemoveNum;
    }

    @PutMapping("{id}")
    public int modifyUser(@PathVariable("id") int id,@RequestBody User user) {
        //成功修改的用户数量
        int successModifyNum = 0;
        userMap.replace(user.getId(), user);
        return successModifyNum++;
    }
}
