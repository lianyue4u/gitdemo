package com.shenzhi.belina.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class FeatureJava {

    // 新特性之前
    @Test
    public void test1() {
        Object o = new String("hello, java 15");
        o = new School();
        if (o instanceof String) {
            String str = (String) o; // 必须显式的声明强制类型转换
            System.out.println(str.contains("java"));
        } else {
            System.out.println("it is not string");
        }
    }

    @Test
    public void test2() {
        Object o = new String("hello, java 15");
        o = new School();
        if (o instanceof String str) { // you do not need to convert type
            System.out.println(str.contains("java"));
        } else {
            System.out.println("it is not string");
        }
    }


}

class School {
    private String student;
    private String teacher;

    //新特性之前
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof School)) return false;
        School school = (School) o;
        return student.equals(school.student) && teacher.equals(school.teacher);
    }
    //新特新之后
    public boolean equal(Object o) {
        if (this == o) return true;
        return o instanceof School school &&
                student.equals(school.student) &&
                teacher.equals(school.teacher);
    }
}

class InstanceOf{
    String str = "张belina";
    public void test(Object obj){
        if (obj instanceof String str){
            System.out.println(str.toUpperCase(Locale.ROOT));
        }else {
            System.out.println(str.toLowerCase(Locale.ROOT));
        }

    }
}










