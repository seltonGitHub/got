package team.strak.yurem.chapter1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.strak.yurem.chapter1.dao.UserDao;
import team.strak.yurem.chapter1.pojo.User;
import team.strak.yurem.chapter1.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public boolean addOne(User user) {
        return userDao.addOne(user);
    }

    @Override
    public User getById(Integer id) {
        return userDao.getById(id);
    }

    @Override
    public boolean update(User user) {
        return userDao.update(user);
    }

    @Override
    public boolean deleteById(User user) {
        return userDao.deleteById(user);
    }
}
