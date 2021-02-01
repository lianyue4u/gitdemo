package com.shenzhi.belina.entity;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private boolean isInResources;
    private boolean isMale;
}