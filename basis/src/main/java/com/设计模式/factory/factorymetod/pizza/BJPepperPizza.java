package com.设计模式.factory.factorymetod.pizza;

/**
 * @Auther: zk
 * @Date: 2021/1/7 16:05
 * @Description:
 */
public class BJPepperPizza extends Pizza {
    public void prepare() {
        // TODO Auto-generated method stub
        setName("北京的胡椒pizza");
        System.out.println(" 北京的胡椒pizza 准备原材料");
    }
}
