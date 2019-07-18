package team.stark.yurem.chapter3_1_2;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalException {

    /**
     * 模拟处理所有可抛出的异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = java.lang.Throwable.class)
    public Map allExceptionHandler(Exception e){
        Map map = new HashMap();
        map.put("status",500);
        map.put("data","a exception occur");
        return map;
    }

}
