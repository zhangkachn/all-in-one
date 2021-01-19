package com.设计模式.adapter.classadapter类适配器;

/**
 * @Auther: zk
 * @Date: 2021/1/18 14:40
 * @Description://被适配的类
 */
public class Voltage220V {
    //输出220V的电压
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}
