package com.设计模式.prototype原型模式.improve;

/**
 * @Auther: zk
 * @Date: 2021/1/14 17:19
 * @Description:
 */
public class Client {
    public static void main(String[] args) {

        System.out.println("原型模式完成对象的创建");
        // TODO Auto-generated method stub
        Sheep sheep = new Sheep("tom",1,"白色");

        Sheep sheep2 = (Sheep)sheep.clone(); //克隆
        Sheep sheep3 = (Sheep)sheep.clone(); //克隆
        Sheep sheep4 = (Sheep)sheep.clone(); //克隆
        Sheep sheep5 = (Sheep)sheep.clone(); //克隆
    }
}
