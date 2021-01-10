package com.设计模式.factory.factorymetod.pizza;

/**
 * @Auther: zk
 * @Date: 2021/1/7 16:06
 * @Description:
 */
public class LDPepperPizza extends Pizza{
    public void prepare() {
        // TODO Auto-generated method stub
        setName("伦敦的胡椒pizza");
        System.out.println(" 伦敦的胡椒pizza 准备原材料");
    }
}
