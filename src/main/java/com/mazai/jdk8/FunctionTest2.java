package com.mazai.jdk8;

import java.util.function.Function;

public class FunctionTest2 {
    public static void main(String[] args) {
        FunctionTest2 functionTest = new FunctionTest2();
        System.out.println(functionTest.compute(5,v1->v1*v1,v2->v2+5));
        System.out.println(functionTest.compute2(5,v1->v1*v1,v2->v2+5));
    }

    public int compute(int a, Function<Integer,Integer> function1,Function<Integer,Integer> function2){
       return function1.compose(function2).apply(a);
    }

    public int compute2(int a, Function<Integer,Integer> function1,Function<Integer,Integer> function2){
        return function1.andThen(function2).apply(a);
    }

}
