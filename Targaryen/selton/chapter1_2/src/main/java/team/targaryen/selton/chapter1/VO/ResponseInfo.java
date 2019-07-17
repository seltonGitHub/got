package team.targaryen.selton.chapter1.VO;

//统一返回类
public class ResponseInfo {
    private Integer status;
    private Object data;

    public ResponseInfo() {
        this.status = 200;
        this.data = new Object();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
