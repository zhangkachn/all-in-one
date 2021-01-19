package com.设计模式.builder;

/**
 * @Auther: zk
 * @Date: 2021/1/17 20:17
 * @Description:
 */
public class builder {
    public static void main(String[] args) {
        // 建造者模式在stringbuilder 中建造
        StringBuilder stringBuilder = new StringBuilder("hello");
        System.out.println(stringBuilder);
    }
}
