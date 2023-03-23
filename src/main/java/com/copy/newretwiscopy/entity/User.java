package com.copy.newretwiscopy.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private String salt;

    private String email;

    private String avatar;

    private String private_info;

//    0 未知 1男 2女
    private Integer sex;

    private Integer status;

    private Profile profile;



}
