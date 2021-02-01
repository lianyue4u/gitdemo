package com.shenzhi.belina.entity;

import ch.qos.logback.classic.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FileCopy {


    public static void main(String[] args) {


        Set<String> set = new HashSet();

        List list = new ArrayList();

        list.add("13344556677");
        list.add("13344556678");
        list.add("13344556679");
        list.add("13344556670");
        list.add("13344556671");
        set.addAll(list);
        String num = "13344556671";
        checkContains(set,num);
    }

    private static void checkContains(Set<String> set,String num) {
            if (set.contains(num)){
                new StringBuffer(num).reverse().toString();
                return;
            }
            else {
                System.out.println(num);
            }
    }


}
