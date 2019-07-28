package com.tyrell.shiyi.dao;

import com.tyrell.shiyi.Entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends JpaRepository<User, Long> {

    User getUserById(Long id);

    /*@Insert("insert into user(name,age) values(#{name}, #{age})")
    Boolean addUser(User user);

    @Update("update user set name=(#{name}),age=(#{age})")
    Boolean modifyUser(User user);
    */



   // @Delete("delete from user where id=(#{id})")
  //  Boolean removeUser(Long id);
}
