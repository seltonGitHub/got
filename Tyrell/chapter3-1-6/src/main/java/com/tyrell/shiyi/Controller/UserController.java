package com.tyrell.shiyi.Controller;

import com.tyrell.shiyi.Entity.User;
import com.tyrell.shiyi.Service.UserService;
import com.tyrell.shiyi.VO.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
        Boolean flag=userService.removeUser(id);
        if (flag){
            responseInfo.setStatus(200);
            responseInfo.setData(flag);
            return responseInfo;
        }
        throw new Exception("an exception occurs");
    }




    @PutMapping("{id}")
    public ResponseInfo modifyUser(User user) throws Exception {
          Boolean flag=userService.modifyUser(user);
          if (flag){
          responseInfo.setStatus(200);
          responseInfo.setData(flag);
          return responseInfo;
            }
          throw new Exception("an exception occurs");
        }


}