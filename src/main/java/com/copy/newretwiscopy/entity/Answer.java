package com.copy.newretwiscopy.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Answer implements Serializable {
    private Integer id;
    private Integer uid;

    private String uname;
    private String avatar;
    private String content;
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time;
    private Integer comment_id;
    private Integer status;


}







