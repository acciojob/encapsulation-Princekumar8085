package com.driver;

public class Main {
    public static void main(String[] args) {


        RWOnly obj = new RWOnly();
        obj.setName("ram");
        obj.setAge(20);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}