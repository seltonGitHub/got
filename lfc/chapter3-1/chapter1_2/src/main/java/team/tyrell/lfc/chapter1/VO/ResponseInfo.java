package team.tyrell.lfc.chapter1.VO;

public class ResponseInfo {
    private Integer status;
    private Object data;

    public ResponseInfo(){}
    public ResponseInfo(Object obj){
        this.status = 200;
        this.data = obj;
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
