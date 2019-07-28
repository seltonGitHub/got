package com.tyrell.shiyi.VO;

import org.springframework.stereotype.Component;

@Component
public class ResponseInfo {
    private Integer status;
    private Object data;

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

    @Override
    public String toString() {
        return "ResponseInfo{" +
                "status=" + status +
                ", data='" + data + '\'' +
                '}';
    }
}
