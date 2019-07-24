package com.tyrell.shiyi.Service.ServiceImpl;

import com.tyrell.shiyi.Entity.User;
import com.tyrell.shiyi.Service.UserService;
import com.tyrell.shiyi.VO.ResponseInfo;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    private static Map<Long, User> userIdAndUserMap = new HashMap<>();
    private static Integer id = 0;

    @Override
    public User getUserByName(Long id) {
        User user = userIdAndUserMap.get(id);
        // System.out.println(user);
        return user;
    }

    @Override
    public Boolean addUser(User user) {
            id++;
            user.setId(id);
            userIdAndUserMap.put(id.longValue(),user);
            System.out.println(userIdAndUserMap.get(id.longValue()));
            return true;
        }

    @Override
    public Integer modifyUser(User user) {
        //成功修改的用户数量
        int successModifyNum = 0;
        Iterator it = userIdAndUserMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            //获取键
            Long key = (Long) entry.getKey();
            //System.out.println("111:"+key);
            if (key == user.getId().longValue()) {
                User user2 = new User();
                user2.setId(user.getId());
                user2.setAge(user.getAge());
                user2.setName(user.getName());
                userIdAndUserMap.put(key, user2);
                successModifyNum = 1;
            }
        }
          return successModifyNum;
}

    @Override
    public Integer removeUser(Long id) {
        //成功删除的用户数量
        int successRemoveNum = 0;
        // remove user
        Iterator it = userIdAndUserMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            //获取键
            Long key = (Long) entry.getKey();
            System.out.println("here222:" + key);
            if (key == id) {
                userIdAndUserMap.remove(key);
                successRemoveNum = 1;
            }
        }
        return successRemoveNum;
}}
