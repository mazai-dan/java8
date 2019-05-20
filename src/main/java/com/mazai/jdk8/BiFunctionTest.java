package com.mazai.jdk8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionTest {
    public static void main(String[] args) {
        BiFunctionTest biFunctionTest = new BiFunctionTest();
        System.out.println(biFunctionTest.compute(5,6,(a,b)->a*b));
        System.out.println(biFunctionTest.compute(5,6,(a,b)->a+b));
        System.out.println(biFunctionTest.compute(5,6,(a,b)->a-b));
        System.out.println(biFunctionTest.compute(5,6,(a,b)->a/b));

        System.out.println(biFunctionTest.compute2(2,4,(a,b)->a*b,v->v+5));//13

    }

    public int compute(int a, int b, BiFunction<Integer,Integer,Integer> biFunction){
       return biFunction.apply(a,b);
    }

    public int compute2(int a, int b, BiFunction<Integer,Integer,Integer> biFunction1, Function<Integer,Integer> biFunction2){
        return biFunction1.andThen(biFunction2).apply(a,b);
    }
}
