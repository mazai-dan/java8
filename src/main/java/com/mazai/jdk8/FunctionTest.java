package com.mazai.jdk8;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest functionTest = new FunctionTest();

       int num1 =  functionTest.compute(2,v->v*v);
       int num2 =  functionTest.compute(5,v->2*v);
       int num3 =  functionTest.compute(5,v->5+v);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        String str = functionTest.convert(5,v->String.valueOf(5+"helloworld"));
        System.out.println(str);

    }

    public int compute(int a, Function<Integer,Integer> function){
        return function.apply(a);
    }

    public String convert (int b,Function<Integer,String> function){
       return function.apply(b);
    }

    public int method1(int a){
        return a*a;
    }

    public int method2(int a){
        return a*2;
    }

    public int method3(int a){
        return a+5;
    }
}
