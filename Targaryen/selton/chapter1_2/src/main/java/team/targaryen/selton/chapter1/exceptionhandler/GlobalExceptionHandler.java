package team.targaryen.selton.chapter1.exceptionhandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import team.targaryen.selton.chapter1.VO.ResponseInfo;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    //统一异常处理

    //程序中发生名为Exception 的异常时 将会被这个方法捕捉到
    //这个方法的参数 e 就是 捕获到的异常 也就是controller中抛出的异常
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseInfo jsonErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        ResponseInfo responseInfo = new ResponseInfo();
        //500一般表示后台出错
        responseInfo.setStatus(500);
        responseInfo.setData(e.getMessage());

        //这个返回结果替代了controller中的返回结果(因为controller中出现了异常 所以controller无法返回结果)
        return responseInfo;
    }

}
