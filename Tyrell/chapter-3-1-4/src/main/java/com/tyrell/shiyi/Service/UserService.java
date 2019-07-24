package com.tyrell.shiyi.Service;

import com.tyrell.shiyi.Entity.User;
import com.tyrell.shiyi.VO.ResponseInfo;
import org.springframework.stereotype.Service;


public interface UserService {
    public User getUserByName(Long id);
    public Boolean addUser(User user);
    public Integer modifyUser(User user);
    public Integer removeUser(Long id);
}
