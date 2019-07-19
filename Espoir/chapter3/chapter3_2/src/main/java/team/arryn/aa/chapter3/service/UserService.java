package team.arryn.aa.chapter3.service;

import team.arryn.aa.chapter3.model.PO.User;
import team.arryn.aa.chapter3.util.Result;

public interface UserService {
    Result addUser(User user);
    Result getUserById(int id);
    Result updateUser(int id,User user);
    Result delUser(int id);
}
