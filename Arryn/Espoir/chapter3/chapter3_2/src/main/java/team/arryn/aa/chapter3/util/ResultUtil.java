package team.arryn.aa.chapter3.util;

/**
 *
 */
public class ResultUtil {

    /**
     * 请求成功，返回正确的数据
     * @param
     * @return
     */
    public static Result success(Object obj){
        Result result =new Result();
        result.setStatus(200);
        result.setMessage("success");
        result.setData(obj);
        return result;
    }

    /**
     * 提供给部分不需要出参的接口
     */
    public static Result success(){
        return success(null);
    }

    /**
     * 自定义错误信息
     * @param status
     * @param msg
     * @return
     */
    public static Result error(int status,String msg){
        Result result=new Result();
        result.setStatus(status);
        result.setMessage(msg);
        result.setData(null);
        return result;
    }

    /**
     * 异常信息时，返回对应的异常信息
     */
    public static Result error(ExceptionEnum exceptionEnum){
        Result result=new Result();
        result.setStatus(exceptionEnum.getStatus());
        result.setMessage(exceptionEnum.getMsg());
        result.setData(null);
        return result;
    }


}
