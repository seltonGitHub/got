package com.tyrell.shiyi.Service;

import com.tyrell.shiyi.Entity.User;


public interface UserService {
    public User getUserByName(Long id);
    public Boolean addUser(User user);
    public Boolean modifyUser(User user);
    public Boolean removeUser(Long id);
}
