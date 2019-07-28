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
        //User user = userIdAndUserMap.get(id);
        // System.out.println(user);
        return userDao.getUserByName(id);
    }

    @Override
    public Boolean addUser(User user) {
            return userDao.addUser(user);
        }

    @Override
    public Boolean modifyUser(User user) {
          return userDao.modifyUser(user);
}

    @Override
    public Boolean removeUser(Long id) {
        return userDao.removeUser(id);
}}
