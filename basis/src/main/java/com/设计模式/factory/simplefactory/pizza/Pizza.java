package com.设计模式.factory.simplefactory.pizza;

/**
 * @Auther: zk
 * @Date: 2021/1/7 00:21
 * @Description: //将Pizza 类做成抽象
 */
public abstract class Pizza {
    protected String name; //名字
    public void bake() {
        System.out.println(name + " baking;");
    }

    public void cut() {
        System.out.println(name + " cutting;");
    }

    //打包
    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }


}
