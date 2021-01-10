package com.设计模式.factory.factorymetod.pizza;

/**
 * @Auther: zk
 * @Date: 2021/1/7 16:06
 * @Description:
 */
public class LDCheesePizza extends Pizza {
    public void prepare() {
        // TODO Auto-generated method stub
        setName("伦敦的奶酪pizza");
        System.out.println(" 伦敦的奶酪pizza 准备原材料");
    }
}
