package com.shenzhi.belina.lambda;

public class LambdaTest {
    public static void main(String[] args) {
        // 匿名内部类
        Runnable runnable = () ->{
            System.out.println("hello world");
        };
    }

}
