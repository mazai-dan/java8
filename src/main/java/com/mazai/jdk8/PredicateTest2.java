package com.mazai.jdk8;

import java.util.Date;
import java.util.function.Predicate;

public class PredicateTest2 {
    public static void main(String[] args) {
        PredicateTest2 test = new PredicateTest2();
        System.out.println(test.isEqual(new Date()).test(new Date()));
    }

    public Predicate<Date> isEqual(Date o){
      return   Predicate.isEqual(o);
    }
}
