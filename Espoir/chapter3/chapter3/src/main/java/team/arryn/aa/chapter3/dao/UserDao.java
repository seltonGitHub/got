package team.arryn.aa.chapter3.dao;


import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import team.arryn.aa.chapter3.PO.User;

@Repository
public interface UserDao {
    @Insert("insert into user (username,password) values(#{username},#{password})")
    void addUser(User user);

    @Select("select * from user where id=#{id}")
    User getUserById(int id);

    @Update("update user set username=#{username},password=#{password} where id=#[id}")
    void modifyUser(User user);

    @Delete("delete from user where id=#{id}")
    void removeUser(int id);
}
