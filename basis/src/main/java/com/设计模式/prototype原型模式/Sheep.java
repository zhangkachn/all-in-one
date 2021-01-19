package com.设计模式.prototype原型模式;

/**
 * @Auther: zk
 * @Date: 2021/1/12 23:48
 * @Description: 定义一只羊
 */
public class Sheep {
    private String name;
    private int age;
    private String color;

    public Sheep(String tom, int i, String 白色) {
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



}
