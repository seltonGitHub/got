package team.targaryen.selton.chapter1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.targaryen.selton.chapter1.dao.IUserDao;
import team.targaryen.selton.chapter1.entity.User;
import team.targaryen.selton.chapter1.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }
}
