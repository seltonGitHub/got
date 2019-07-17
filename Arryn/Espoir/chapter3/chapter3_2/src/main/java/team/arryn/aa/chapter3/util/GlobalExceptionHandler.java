package team.arryn.aa.chapter3.util;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     *统一异常处理，程序中发生名为Exception的异常时，被该方法捕获
     *
     */
    @ExceptionHandler(value=Exception.class)
    @ResponseBody
    public Result handler(HttpServletRequest req,Exception e){
       return new Result(500,e.getMessage());
    }
}
