package team.tyrell.lfc.chapter1.controller;

import org.springframework.web.bind.annotation.*;
import team.tyrell.lfc.chapter1.VO.ResponseInfo;
import team.tyrell.lfc.chapter1.entity.User;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("user")
public class UserController {
    private static Map<Integer, User> userMap = new HashMap<>();


    @PostMapping("add")
    public ResponseInfo addUser(@RequestBody User user) {
        userMap.put(user.getId(), user);
        return new ResponseInfo("ok");
    }

    @GetMapping("{id}")
    public ResponseInfo userGetById(@PathVariable("id") int id) throws Exception  {
//        throw new Exception("a exception occur");
       /* User user = userMap.get(id);
        System.out.println("user = " + user);*/
        return new ResponseInfo(userMap.get(id));
    }

    @DeleteMapping("{id}")
    public ResponseInfo removeUser(@PathVariable("id") int id) {
        //成功删除的用户数量
        int successRemoveNum = 0;
        userMap.remove(id);
        return new ResponseInfo(++successRemoveNum);
    }

    @PutMapping("{id}")
    public ResponseInfo modifyUser(@PathVariable("id") int id,@RequestBody User user) {
        //成功修改的用户数量
        int successModifyNum = 0;
        userMap.replace(user.getId(), user);
        return new ResponseInfo(successModifyNum++);
    }
}
