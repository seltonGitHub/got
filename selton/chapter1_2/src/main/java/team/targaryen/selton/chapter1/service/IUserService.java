package team.targaryen.selton.chapter1.service;

import team.targaryen.selton.chapter1.entity.User;

public interface IUserService {
    int addUser(User user);
    int deleteById(int id);
    int updateOne(User user);
    User findById(int id);
}
