package com.xms;

/**
 * @author fangxiaoran
 * @create 2020 - 12 - 16  22:17
 **/
public class entity {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        int a= 10;
        int b = 5+5;
        System.out.println(a==b);
    }
}
