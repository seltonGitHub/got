package team.strak.yurem.chapter1.service;

import team.strak.yurem.chapter1.pojo.User;

public interface UserService {
    boolean addOne(User user);

    User getById(Integer id);

    boolean update(User user);

    boolean deleteById(User user);
}
