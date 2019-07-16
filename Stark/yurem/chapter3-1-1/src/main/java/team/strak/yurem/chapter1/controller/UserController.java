package team.strak.yurem.chapter1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import team.strak.yurem.chapter1.pojo.User;
import team.strak.yurem.chapter1.service.UserService;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 添加用户需手动指定id
     * @param user
     * @param result
     * @return
     */
    @PostMapping("/add")
    public Map addOne(@Valid User user, BindingResult result) {
        Map<String, String> map = new HashMap<>();
        if (result.hasErrors()) {
            map = getErrors(result);
        } else {
            if (userService.addOne(user)) {
                map.put("msg", "OK");
            } else {
                map.put("msg", "未知错误");
            }
        }
        return map;
    }

    @GetMapping("{id}")
    public User getById(@PathVariable("id") Integer id) {
        return id == null ? null : userService.getById(id);
    }

    @PutMapping("{id}")
    public Map update(@Valid User user,BindingResult result){
        Map<String, String> map = new HashMap<>();
        if (result.hasErrors()) {
            map = getErrors(result);
        } else {
            if (userService.update(user)) {
                map.put("msg", "1");
            } else {
                map.put("msg", "0");
            }
        }
        return  map;
    }

    @DeleteMapping("{id}")
    public Map deleteById(@Valid User user,BindingResult result){
        Map<String, String> map = new HashMap<>();
        if (result.hasErrors()) {
            map = getErrors(result);
        } else {
            if (userService.deleteById(user)) {
                map.put("msg", "1");
            } else {
                map.put("msg", "0");
            }
        }
        return  map;
    }

    public Map<String, String> getErrors(BindingResult result) {
        List<FieldError> err = result.getFieldErrors();
        StringBuilder msg = new StringBuilder();
        FieldError fe;
        String field;
        String errorMessage;
        for (int i = 0; i < err.size(); i++) {
            fe = err.get(i);
            field = fe.getField();//得到那个字段验证出错
            errorMessage = fe.getDefaultMessage();//得到错误消息
            msg.append(field + " : " + errorMessage);
        }
        Map<String, String> map = new HashMap<>();
        map.put("msg", msg.toString());
        return map;
    }
}
