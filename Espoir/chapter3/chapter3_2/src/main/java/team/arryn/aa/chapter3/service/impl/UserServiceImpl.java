package team.arryn.aa.chapter3.service.impl;


import org.springframework.stereotype.Service;
import team.arryn.aa.chapter3.dao.UserDao;
import team.arryn.aa.chapter3.dao.impl.UserDaoImpl;
import team.arryn.aa.chapter3.model.PO.User;
import team.arryn.aa.chapter3.service.UserService;
import team.arryn.aa.chapter3.util.Result;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao =new UserDaoImpl();

    @Override
    public Result addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public Result getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public Result updateUser(int id,User user) {
        return userDao.modifyUser(id,user);
    }

    @Override
    public Result delUser(int id) {
        return userDao.removeUser(id);
    }


}
