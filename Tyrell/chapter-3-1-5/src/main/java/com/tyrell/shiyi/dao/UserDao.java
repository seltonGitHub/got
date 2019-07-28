package com.tyrell.shiyi.dao;

import com.tyrell.shiyi.Entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;



public interface UserDao {
    @Select("select * from user where id=(#{id})")
    User getUserByName(Long id);

    @Insert("insert into user(name,age) values(#{name}, #{age})")
    Boolean addUser(User user);

    @Update("update user set name=(#{name}),age=(#{age})")
    Boolean modifyUser(User user);

    @Delete("delete from user where id=(#{id})")
    Boolean removeUser(Long id);
}
