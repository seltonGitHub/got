package com.tyrell.shiyi.Service.ServiceImpl;

import com.tyrell.shiyi.Entity.User;
import com.tyrell.shiyi.Service.UserService;
import com.tyrell.shiyi.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserByName(Long id) {
        //Long转为Integer
        //Long x = (long) id; Integer y = x.intValue();
        return userDao.getUserById(id);
    }

    @Override
    public Boolean addUser(User user) {
            User newUser= userDao.save(user);
            if (newUser!=null){
                return true;
            }
            return false;
        }

    @Override
    public Boolean modifyUser(User user) {
        User getUser=userDao.getUserById(user.getId());
        getUser.setName(user.getName());
        getUser.setAge(user.getAge());
        User newUser= userDao.save(getUser);
        if (newUser!=null){
            return true;
        }
        return false;
}

    @Override
    public Boolean removeUser(Long id) {
        if (userDao.getOne(id)!=null) {
            userDao.deleteById(id);
            return true;
        }
        return false;
}}
