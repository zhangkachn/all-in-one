package com.设计模式.adapter.objectadapter对象适配器;

/**
 * @Auther: zk
 * @Date: 2021/1/18 14:44
 * @Description:
 */
public class Phone {
    //充电
    public void charging(IVoltage5V iVoltage5V) {
        if(iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V, 可以充电~~");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压大于5V, 不能充电~~");
        }
    }
}
