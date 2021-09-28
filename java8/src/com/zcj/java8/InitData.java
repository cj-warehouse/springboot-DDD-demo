package com.zcj.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author zong.cj
 * @Date 2021/9/28 17:02
 * @Description TODO
 **/
public class InitData {

    public static List<String> getList(){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("A");
        list.add("C");
        list.add("B");
        list.add("E");
        list.add("F");
       return list;
    }

    public static Map<String,String> getMap(){
        Map<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("4","4");
        map.put("7","7");
        map.put("5","5");
        map.put("6","6");
        return map;
    }

}
