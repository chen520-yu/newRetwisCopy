package com.copy.newretwiscopy.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Profile implements Serializable {
    private Integer followers;

    private Integer followings;

    private Integer collects;
}
