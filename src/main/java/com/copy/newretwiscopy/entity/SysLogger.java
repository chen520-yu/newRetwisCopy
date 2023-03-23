package com.copy.newretwiscopy.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SysLogger implements Serializable {
    private Integer id;
    private String desc;

    @JsonFormat(locale = "zh", timezone = "GMT+8",  pattern = "yyyy-MM-DD HH:MM:SS")
    private Date start_time;

    private String ip;
    private Integer uid;

    private String url;

    private String request_type;
    private String class_method;
    private String params;
    private String response;

    private String exce_time; // 运行时间
    private String log_type;//日志的类型 正常和异常



}
