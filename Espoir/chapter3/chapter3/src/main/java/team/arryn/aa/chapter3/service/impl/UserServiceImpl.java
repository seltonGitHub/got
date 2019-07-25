package team.arryn.aa.chapter3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.arryn.aa.chapter3.PO.User;
import team.arryn.aa.chapter3.dao.UserDao;

import team.arryn.aa.chapter3.service.UserService;
import team.arryn.aa.chapter3.util.Result;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public Result addUser(User user) {
        Result result = new Result();
        if (user==null && "".equals(user.getUsername())){
            result.setStatus(200);
            result.setData("用户名为空");
        }else {
            userDao.addUser(user);
            result.setStatus(200);
            result.setData("ok");
        }
        return result;
    }

    @Override
    public Result getUserById(int  id) {
        Result result = new Result();
        User user = userDao.getUserById(id);
        if (user==null){
            result.setStatus(200);
            result.setData("用户不存在");
        }else {
            result.setStatus(200);
            result.setData(user);
        }
        return result;
    }

    @Override
    public Result delUser(int id) {
        userDao.removeUser(id);
        return new Result("ok");
    }

    @Override
    public Result updateUser(User user) {
        userDao.modifyUser(user);
        return new Result("ok");
    }


}
