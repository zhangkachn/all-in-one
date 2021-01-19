package com.设计模式.builder;

/**
 * @Auther: zk
 * @Date: 2021/1/16 16:06
 * @Description: 抽象类
 */
public  abstract class AbstractHouse {
    //打地基
    public abstract void buildBasic();
    //砌墙
    public abstract void buildWalls();
    //封顶
    public abstract void roofed();

    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
