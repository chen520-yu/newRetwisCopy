package com.copy.newretwiscopy.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.models.auth.In;
import lombok.Data;

import java.io.Serializable;

@Data
public class Post implements Serializable {
    private Integer id;
    private String title;
    private String content;
    private String descr;

    private Integer uid;
    private Integer status;//是否删除
    private Integer type_id;
    private Integer author;//1 代表原创， 0代表转发
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-DD HH:MM:SS")
    private Data create_time;

}
