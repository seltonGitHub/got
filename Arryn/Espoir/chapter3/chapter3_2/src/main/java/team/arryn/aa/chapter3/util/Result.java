package team.arryn.aa.chapter3.util;

/**
 * 返回的信息
 * @param <T>
 */
public class Result<T> {

    private int  status;

    private T data;

    public Result() {
    }

    public Result(int status, T data) {
        this.status = status;
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "status=" + status +
                ", data=" + data +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}