package team.arryn.aa.chapter3.util;

/**
 * 异常枚举类，记录已知的异常
 */
public enum ExceptionEnum {
    UNKNOW_ERROR(-1,"未知错误"),USER_NOT_FIND(-101,"用户不存在");
    private int status;
    private String msg;

    ExceptionEnum(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
