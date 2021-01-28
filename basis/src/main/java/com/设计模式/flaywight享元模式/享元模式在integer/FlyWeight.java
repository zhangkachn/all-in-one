package com.设计模式.flaywight享元模式.享元模式在integer;

/**
 * @Auther: zk
 * @Date: 2021/1/24 16:51
 * @Description:
 */
public class FlyWeight {
    public static void main(String[] args) {
        Integer x = Integer.valueOf(127);
        Integer y = new Integer(127);
        Integer z = Integer.valueOf(127);
        Integer w = new Integer(127);
        System.out.println(x.equals(y)); // ?
        System.out.println(x == y); // ?
        System.out.println(x == z); // ?
        System.out.println(w == x); // ?
        System.out.println(w == y); // ?
    }
}
