package team.arryn.aa.chapter3.dao;

import team.arryn.aa.chapter3.model.PO.User;
import team.arryn.aa.chapter3.util.Result;

public interface UserDao {
    public abstract Result addUser(User user);
    public abstract Result getUserById(int id);
    public abstract Result removeUser(int id);
    public abstract Result modifyUser(int id,User user);
}
