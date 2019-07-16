package team.array.xilpikachu.chapter1.controller;

import org.springframework.web.bind.annotation.*;
import team.array.xilpikachu.chapter1.entity.User;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {

    private static Map<Long, User> userIdAndUserMap = new HashMap<>();

    @GetMapping("{id}")
    public User getUserByName(@PathVariable("id") long id){
        return userIdAndUserMap.get(id);
    }

    @PostMapping("add")
    public String addUser(User user){
        userIdAndUserMap.put(user.getId(),user);
        return "ok";
    }

    @DeleteMapping("{id}")
    public int removeUser(@PathVariable("id") long id){
        //成功删除的用户数量
        int successRemoveNum = 0;
        for (Long key : userIdAndUserMap.keySet())
        {
            if (id == key)
            {
                userIdAndUserMap.remove(id);
                successRemoveNum++;
            }
            break;
        }
        return successRemoveNum;
    }

    @PutMapping("{id}")
    public int modifyUser(User user,@PathVariable("id") long id){
        //成功修改的用户数量
        int successModifyNum = 0;
        for (Long key : userIdAndUserMap.keySet())
        {
            if (id == key)
            {
                userIdAndUserMap.put(user.getId(),user);
                successModifyNum++;
            }
            break;
        }
        return successModifyNum;
    }
}
