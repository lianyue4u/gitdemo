package com.shenzhi.belina.mapper;

import com.baomidou.mybatisplus.core.toolkit.BeanUtils;
import com.shenzhi.belina.entity.User;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctTest {


    public static void main(String[] args) {

        List<User> list = new ArrayList();

        User user = new User();
        user.setName("xiaoming");
        user.setMale(true);
        user.setInResources(false);

        User user1 = new User();
        user1.setName("xiaoming");
        user1.setMale(true);
        user1.setInResources(true);

        User user2 = new User();
        user2.setName("xiaoming");
        user2.setMale(false);
        user2.setInResources(true);

        User user3 = new User();
        user3.setName("xiaoming");
        user3.setMale(false);
        user3.setInResources(false);

        User user4 = new User();
        user4.setName("xiaoming");
        user4.setMale(false);
        user4.setInResources(false);

        User user5 = new User();
        user5.setName("xiaohong");
        user5.setMale(true);
        user5.setInResources(false);

        User user6 = new User();
        user6.setName("xiaohong");
        user6.setMale(false);
        user6.setInResources(false);

        User user7 = new User();
        user7.setName("xiaohong");
        user7.setMale(false);
        user7.setInResources(false);



        list.add(user);
        list.add(user2);
        list.add(user1);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        list.add(user6);
        list.add(user7);

        list.stream().forEach(System.out::println);

        List<Boolean> collect = list.stream().map(User::isMale).collect(Collectors.toList());
        System.out.println(collect);
    }
}
