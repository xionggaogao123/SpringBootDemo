package com.example.demo.controller;

/**
 * @author keven
 * @date 2018-07-06 下午4:11
 * @Description
 */
public class TestString {

    public static void main(String[] args) {

        //String a = "2.sure";
        String a = ".question";

        String b = a.substring(0, a.lastIndexOf("."));
        String c  = a.substring(a.lastIndexOf(".") + 1);
        System.out.println(b);
        System.out.println(c);


    }
}
