package com.shenzhi.belina.lambda;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.shenzhi.belina.entity.Customer;

import java.util.HashSet;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customer = new Customer("belina", new Customer("zhang", null));
        System.out.println(customer.toString());
        System.out.println(customer.name()); // 类似于原有的实例变量的get方法

        HashSet set = new HashSet<>(); // 验证是否重写了equals方法
        Customer customer1 = new Customer("belina", new Customer("zhang", null));
        set.add(customer);
        set.add(customer1);
        set.forEach(System.out::println);




    }
}
