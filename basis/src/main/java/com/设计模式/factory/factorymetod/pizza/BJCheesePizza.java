package com.设计模式.factory.factorymetod.pizza;

/**
 * @Auther: zk
 * @Date: 2021/1/7 16:05
 * @Description:
 */
public class BJCheesePizza extends Pizza {
    public void prepare() {
        // TODO Auto-generated method stub
        setName("北京的奶酪pizza");
        System.out.println(" 北京的奶酪pizza 准备原材料");
    }
}
