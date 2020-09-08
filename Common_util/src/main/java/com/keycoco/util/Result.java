package com.keycoco.util;

import java.util.List;

/**
 * 对leyui列表返回数据进行封装
 * @author FeiBinHua
 * @date 2020/8/22
 */
public class Result {
    private static final long serialVersionUID = 1L;
    private String code;
    private String msg;
    private Long count;
    private List<?> data;

    public Result() {
    }

    public Result(String code, String msg, Long count, List<?> data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }
}
