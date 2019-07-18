package team.stark.yurem.chapter3_1_2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("{id}")
    public Map add(Integer id) throws Exception {
        Map result = new HashMap(2);
        if(new Random().nextBoolean()){
            throw new Exception("模拟抛出一个异常");
        }else{
            Map user = new HashMap(3);
            user.put("id",2);
            user.put("name","xiaolin");
            user.put("age",21);

            result.put("status", "200");
            result.put("data", user);
            return result;
        }
    }

}
