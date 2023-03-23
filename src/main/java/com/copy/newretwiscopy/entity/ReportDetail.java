package com.copy.newretwiscopy.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class ReportDetail implements Serializable {
    private String username;

    private String address;//举报的地址 用户地址或文章地址
}
