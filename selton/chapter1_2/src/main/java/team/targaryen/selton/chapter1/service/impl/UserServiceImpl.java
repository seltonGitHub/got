package team.targaryen.selton.chapter1.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.targaryen.selton.chapter1.dao.IUserDao;
import team.targaryen.selton.chapter1.entity.User;
import team.targaryen.selton.chapter1.service.IUserService;

import java.util.Optional;

@Service
@Slf4j
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public int addUser(User user) {
        User saveUser = userDao.save(user);
        log.info("success save user {}", saveUser);
        return 1;
    }

    @Override
    public int deleteById(int id) {
        userDao.deleteById(id);
        return 1;
    }

    @Override
    public int updateOne(User user) {
        userDao.modifySingle(user.getId(), user.getName(), user.getHobby());
        log.info("success save and flush {}.", user);
        return 1;
    }

    @Override
    public User findById(int id) {
        Optional<User> optionalUser = userDao.findById(id);
        return optionalUser.get();
    }

}
