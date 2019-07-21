package com.tyrell.shiyi.chapter3.Controller;

import com.tyrell.shiyi.chapter3.Entity.User;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import com.tyrell.shiyi.chapter3.VO.ResponseInfo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


@RestController
@RequestMapping("user")
public class UserController {

    private static Map<Long, User> userIdAndUserMap = new HashMap<>();
    private static Integer id =0;
    private ResponseInfo responseInfo=new ResponseInfo();

    @GetMapping("{id}")
    public ResponseInfo getUserByName(@PathVariable("id") Long id) throws Exception {
       //System.out.println(id);
        User user=userIdAndUserMap.get(id);
        System.out.println(user);
        if(user==null) {
            throw new Exception("an exception occurs");
        }else {
            responseInfo.setStatus(200);
            responseInfo.setData(user);
            return responseInfo;
        }
        }


    @PostMapping("add")
    public ResponseInfo addUser(User user) throws Exception{
        // save user
        if(user.getName()==null||user.getAge()==0) {
            throw new Exception("an exception occurs");
        }else {
        id++;
        user.setId(id);
        //System.out.println(id.longValue());
        //System.out.println(user);
        userIdAndUserMap.put(id.longValue(),user);
        System.out.println(userIdAndUserMap.get(id.longValue()));
        responseInfo.setStatus(200);
        responseInfo.setData("ok");
        return responseInfo;
        }
    }

    @DeleteMapping("{id}")
    public ResponseInfo removeUser(@PathVariable("id") long id) throws Exception{
        //成功删除的用户数量
        int successRemoveNum = 0;
        // remove user
        Iterator it = userIdAndUserMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            //获取键
            Long key = (Long) entry.getKey();
            System.out.println("here222:" + key);
            if (key == id) {
                userIdAndUserMap.remove(key);
                successRemoveNum = 1;
                responseInfo.setStatus(200);
                responseInfo.setData(successRemoveNum);
                return responseInfo;
            }
        }
            throw new Exception("an exception occurs");

    }



    @PutMapping("{id}")
    public ResponseInfo modifyUser(User user) throws Exception {
        //成功修改的用户数量
        int successModifyNum = 0;
        Iterator it = userIdAndUserMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            //获取键
            Long key = (Long) entry.getKey();
            //System.out.println("111:"+key);
            if (key == user.getId().longValue()) {
                User user2 = new User();
                user2.setId(user.getId());
                user2.setAge(user.getAge());
                user2.setName(user.getName());
                userIdAndUserMap.put(key, user2);
                successModifyNum = 1;
                responseInfo.setStatus(200);
                responseInfo.setData(successModifyNum);
                return responseInfo;
            }
        }
        throw new Exception("an exception occurs");
    }


}