package team.arryn.aa.chapter3.dao.impl;

import team.arryn.aa.chapter3.dao.UserDao;
import team.arryn.aa.chapter3.model.PO.User;
import team.arryn.aa.chapter3.util.Result;

import java.util.HashMap;
import java.util.Map;

public class UserDaoImpl implements UserDao {
    static private Map<Integer,User> userMap=new HashMap<>();
    private int id;

    @Override
    public Result addUser(User user) {
        id++;
        user.setId(id);
        userMap.put(id,user);
        return new Result("ok");
    }

    @Override
    public Result getUserById(int id) {
        return new Result(userMap.get(id));
    }


    @Override
    public Result removeUser( int id) {
        int successRemoveNum=0;
        userMap.remove(id);
        return new Result(successRemoveNum);
    }


    @Override
    public Result modifyUser(int id,User user) {
        int secModifyNum=0;
        userMap.replace(id,user);
        return new Result(secModifyNum);
    }
}

