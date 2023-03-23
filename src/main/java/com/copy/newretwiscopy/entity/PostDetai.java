package com.copy.newretwiscopy.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class PostDetai implements Serializable {
    //  类型名称
    private String name;

    private String username;

    private String avatar;

    private Integer starts;

    private Integer collects;

    private Boolean isStart;

    private Boolean isCollect;
}
