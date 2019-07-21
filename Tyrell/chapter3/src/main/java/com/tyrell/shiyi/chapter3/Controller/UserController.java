package com.tyrell.shiyi.chapter3.Controller;

import com.tyrell.shiyi.chapter3.Entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {

    private static Map<Long, User> userIdAndUserMap = new HashMap<>();
    private static Integer id =0;

    @GetMapping("{id}")
    public User getUserByName(@PathVariable("id") Long id) {
        System.out.println(id);
        User user=userIdAndUserMap.get(id);
        System.out.println(user);
        if(user==null) {
            return null;
        }else
            return user;

    }

    @PostMapping("add")
    public String addUser(User user) {
        // save user
        id++;
        user.setId(id);
        //System.out.println(id.longValue());
        //System.out.println(user);
        userIdAndUserMap.put(id.longValue(),user);
        System.out.println(userIdAndUserMap.get(id.longValue()));
        return "ok";
    }

    @DeleteMapping("{id}")
    public int removeUser(@PathVariable("id") long id) {
        //成功删除的用户数量
        int successRemoveNum = 0;
        // remove user
        Iterator it = userIdAndUserMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            //获取键
            Long key = (Long) entry.getKey();
            System.out.println("here222:"+key);
            if (key==id){
                userIdAndUserMap.remove(key);
                successRemoveNum=11;
            }
        }
        return successRemoveNum;
    }

    @PutMapping("{id}")
    public int modifyUser(User user) {
        //成功修改的用户数量
        int successModifyNum = 0;
        Iterator it = userIdAndUserMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            //获取键
            Long key = (Long) entry.getKey();
            //System.out.println("111:"+key);
            if (key==user.getId().longValue()){
            User user2=new User();
            user2.setId(user.getId());
            user2.setAge(user.getAge());
            user2.setName(user.getName());
            userIdAndUserMap.put(key,user2);
            successModifyNum=1;
            }
        }
        return successModifyNum;
    }
}
