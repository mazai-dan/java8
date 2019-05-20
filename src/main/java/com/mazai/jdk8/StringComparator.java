package com.mazai.jdk8;

import java.util.*;

public class StringComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("zhangsan","lisi","wangwu");

//        names.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        names.sort(String::compareTo);



        //expression-style  o2.compareTo(o1)
        //statement-style  {return o2.compareTo(o1);}
        Collections.sort(names,(o1,o2) -> o2.compareTo(o1));
        names.forEach(System.out::println);
    }
}
