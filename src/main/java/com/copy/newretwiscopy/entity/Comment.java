package com.copy.newretwiscopy.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;

@Data
public class Comment implements Serializable {
    private Integer id;
    private Integer uid;
    private String uname;
    private String avatar;

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-DD HH:MM:SS")
    private Data time;
    private String content;
    private Integer pid;
    private Integer status;

}
