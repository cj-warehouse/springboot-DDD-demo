package com.zcj.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zong.cj
 * @Date 2021/9/28 16:57
 * @Description java8基础训练
 **/
public class Test {
    public static void main(String[] args) {
        test1();
    }

    /**
     * 循环
     */
    public static void test1(){
        List<String> list = InitData.getList();
        //最基本的循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-------------------------------------");
        //增强for循环
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-------------------------------------");
        //java8
        list.forEach(s->{
            System.out.println(s);
        });
//        list.forEach(System.out::println);
        System.out.println("-------------------------------------");
        //java8
        list.stream().forEach( System.out::println);
    }
}
