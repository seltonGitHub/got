package team.strak.yurem.chapter1.dao.impl;

import org.springframework.stereotype.Repository;
import team.strak.yurem.chapter1.dao.UserDao;
import team.strak.yurem.chapter1.pojo.User;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDaoImpl implements UserDao {

    private Map<Integer, User> users;

    {
        users = new HashMap<>();
        for (int i = 1; i < 10; i++) {
            User user = new User(i,"同学"+i,10+i);
            users.put(i, user);
        }
    }


    @Override
    public boolean addOne(User user) {
        if(users.containsKey(user.getId())){
            return false;
        }else{
            users.put(user.getId(), user);
            return true;
        }
    }

    @Override
    public User getById(Integer id) {
        User user = users.get(id);
        return user;
    }

    @Override
    public boolean update(User user) {
        if(users.containsKey(user.getId())){
            users.put(user.getId(), user);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean deleteById(User user) {
        if(users.containsKey(user.getId())){
            users.remove(user.getId());
            return true;
        }else {
            return false;
        }
    }
}
