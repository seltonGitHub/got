package team.stark.allen.chapter1.controller;

import org.springframework.web.bind.annotation.*;
import team.stark.allen.chapter1.domain.User;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@RestController
@RequestMapping("user")
public class AController {

    private static Map<Integer, User> userIdAndUserMap = new HashMap<>();
    int id =1;
    @PostMapping("add")
    public String addUser(User user){

        user.setId(id);
        userIdAndUserMap.put(id,user);
        id++;
        return "id:"+user.getId()+"name:"+user.getName()+"age:"+user.getAge();
    }



    @GetMapping("{id}")
    public User getUser(@PathVariable("id") int id){
        User user=userIdAndUserMap.get(id);
        if(user==null) {
           return null;
        }else
            return user;
    }

    @DeleteMapping("{id}")
    public int removeUser(@PathVariable("id") int id){
        int successRemoveNum = 0;
        User user=userIdAndUserMap.get(id);
        if(user==null) {
            return successRemoveNum;
        }else {
            userIdAndUserMap.remove(id);
            successRemoveNum++;
        };
        return successRemoveNum;
    }

    @PutMapping("{id}")
    public int modifyUser(User user){
        int successRemoveNum = 0;

        if(userIdAndUserMap.containsKey(user.getId())){
            userIdAndUserMap.replace(user.getId(),user);
            successRemoveNum++;
        };
        return successRemoveNum;
    }
}
