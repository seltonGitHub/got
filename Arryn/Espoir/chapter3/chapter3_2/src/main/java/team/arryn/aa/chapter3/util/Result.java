package team.arryn.aa.chapter3.util;

/**
 * 传给前端的数据,返回的结果
 * @param <T>
 */
public class Result<T> {

    private int  status;
    private String message;
    private T data;

    public Result() {
    }

    public Result(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "status=" + status +
                ", message=" + message +
                ", data=" + data +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}