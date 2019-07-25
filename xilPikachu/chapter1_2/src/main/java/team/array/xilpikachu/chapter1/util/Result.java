package team.array.xilpikachu.chapter1.util;

import lombok.Data;

@Data
public class Result {
    private int status;
    private Object data;

    public Result(){

    }

    public Result(Object data) {
        this.status = 200;
        this.data = data;
    }

    public Result(int status, Object data) {
        this.status = status;
        this.data = data;
    }
}
