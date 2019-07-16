package team.strak.yurem.chapter1.dao;

import team.strak.yurem.chapter1.pojo.User;

public interface UserDao {
    boolean addOne(User user);

    User getById(Integer id);

    boolean update(User user);

    boolean deleteById(User user);
}
