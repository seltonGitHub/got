package team.targaryen.selton.chapter1.dao;

import org.apache.ibatis.annotations.Insert;
import team.targaryen.selton.chapter1.entity.User;

public interface IUserDao {
    @Insert("INSERT INTO user(name, hobby) VALUES(#{name},#{hobby})")
    int addUser(User user);
}
