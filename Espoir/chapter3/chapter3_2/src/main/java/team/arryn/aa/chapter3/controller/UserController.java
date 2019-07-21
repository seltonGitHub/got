package team.arryn.aa.chapter3.controller;

import org.springframework.web.bind.annotation.*;;
import team.arryn.aa.chapter3.model.PO.User;
import team.arryn.aa.chapter3.service.UserService;
import team.arryn.aa.chapter3.service.impl.UserServiceImpl;
import team.arryn.aa.chapter3.util.Result;

@RestController
@RequestMapping("user")
public class UserController {

    private UserService userService=new UserServiceImpl();

    @PostMapping("add")
    public Result loginController(User user){
        return userService.addUser(user);
    }

    @GetMapping("{id}")
    public Result selectUser(@PathVariable("id") int id) throws Exception {
        return userService.getUserByUsername(id);
    }

    @DeleteMapping("{id}")
    public Result delUser(@PathVariable("id") int id) {
        return userService.delUser(id);
    }

    @PutMapping("{id}")
    public Result updateUser(@PathVariable("id") int id, User user) {
        return userService.updateUser(id,user);
    }
}
