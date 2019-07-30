package team.targaryen.selton.chapter1.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import team.targaryen.selton.chapter1.VO.ResponseInfo;
import team.targaryen.selton.chapter1.exception.message.MessageUtils;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    //统一异常处理

    //程序中发生名为Exception 的异常时 将会被这个方法捕捉到
    //这个方法的参数 e 就是 捕获到的异常 也就是controller中抛出的异常
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseInfo jsonErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        log.error("occur error {}.", e);
        ResponseInfo responseInfo = new ResponseInfo();
        //500一般表示后台出错
        responseInfo.setStatus(500);
        responseInfo.setData(MessageUtils.getMsg(e.getMessage()));

        //这个返回结果替代了controller中的返回结果(因为controller中出现了异常 所以controller无法返回结果)
        return responseInfo;
    }

}
