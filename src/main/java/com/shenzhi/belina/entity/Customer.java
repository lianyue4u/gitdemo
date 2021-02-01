package com.shenzhi.belina.entity;

public record Customer(String name, Customer partner) { // 小括号内定义成员变量

//  还可以声明构造器，静态的变量、方法、实例方法
    public Customer(String name){
        this(name,null);
    }

    public static String info;

    public void show(){
        System.out.println("i am a singer , my name is "+ name());
    }

    public  static  void  shown(){
        System.out.println("my girl`s name is belina");
    }

    //不可以在record中定义实例变量
//    public int id;

    private static Person person;

    public static int id;


}

//record不可以声明为abstract;
//abstract record Employee(){}

//不可以显示的继承于其他类，因为本身已经继承于record
//record Employee() extends Thread{}











