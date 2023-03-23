package com.copy.newretwiscopy.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 用于返回前端的json数据的工具类
 *  封装统一返回结果集
 */
@Data
public class Msg implements Serializable {
    private int status;

    private String message;

//    封装有效数据
    private Map<String, Object> data = new HashMap<String, Object>();

    public static Msg success(){
        Msg result = new Msg();
        result.setStatus(200);
        result.setMessage("success");
        return result;
    }

    public static Msg success(String message) {
        Msg result = new Msg();
        result.setStatus(200);
        result.setMessage(message);
        return result;
    }
    public static Msg success(Map<String,Object> map) {
        Msg result = new Msg();
        result.setStatus(200);
        result.setData(map);
        return result;
    }

    public static Msg fail(){
        Msg res = new Msg();
        res.setStatus(400);
        res.setMessage("fail");
        return res;
    }

    public static Msg fail(String message){
        Msg res = new Msg();
        res.setStatus(400);
        res.setMessage(message);
        return res;
    }

    public static Msg noPermission() {
        Msg result = new Msg();
        result.setStatus(401);
        result.setMessage("no permission");
        return result;
    }

    public static Msg error() {
        Msg result = new Msg();
        result.setStatus(500);
        result.setMessage("error");
        return result;
    }
    public static Msg error(String msg) {
        Msg result = new Msg();
        result.setStatus(500);
        result.setMessage(msg);
        return result;
    }

    public static Msg code(int code){
        Msg res = new Msg();
        res.setStatus(code);
        res.setMessage("exception");
        return res;
    }

    public Msg add(String key, Object value){
        this.data.put(key,value);
        return this;
    }


}
