package com.tyrell.shiyi.Controller;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.tyrell.shiyi.Entity.User;
import com.tyrell.shiyi.Service.UserService;
import com.tyrell.shiyi.VO.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private ResponseInfo responseInfo;
    @Autowired
    private User user;



    @GetMapping("{id}")
    public ResponseInfo getUserByName(@PathVariable("id") Long id) throws Exception {
       //System.out.println(id);
        user=userService.getUserByName(id);
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
        Boolean flag=userService.addUser(user);
        if (flag){
        responseInfo.setStatus(200);
        responseInfo.setData("ok");
        return responseInfo;
        }else{
            throw new Exception("an exception occurs");
        }
        }
    }

    @DeleteMapping("{id}")
    public ResponseInfo removeUser(@PathVariable("id") long id) throws Exception{
        Integer value=userService.removeUser(id);
        if (value==1||value==0){
            responseInfo.setStatus(200);
            responseInfo.setData(value);
            return responseInfo;
        }
        throw new Exception("an exception occurs");
    }




    @PutMapping("{id}")
    public ResponseInfo modifyUser(User user) throws Exception {
          Integer value=userService.modifyUser(user);
          if (value==1||value==0){
          responseInfo.setStatus(200);
          responseInfo.setData(value);
          return responseInfo;
            }
          throw new Exception("an exception occurs");
        }


}