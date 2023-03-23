package com.copy.newretwiscopy.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Date;

@Data
public class Report implements Serializable {
    private Integer id;

    private Integer from_uid;

    private Integer to_id;

    private String content;

    @JsonFormat(locale = "zh", timezone = "GMT+8",  pattern = "yyyy-MM-DD HH:MM:SS")
    private Date time;

    private Integer status;

    private Integer type;


}
