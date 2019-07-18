package team.arryn.aa.chapter3.util;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;



@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     *统一异常处理，程序中发生名为Exception的异常时，被该方法捕获
     * 返回自定义的结果集对象
     *
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        ExceptionLog.loging(e);
       return ResultUtil.error(ExceptionEnum.UNKNOW_ERROR);
    }
}
