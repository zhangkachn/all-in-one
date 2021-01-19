package com.设计模式.adapter.objectadapter对象适配器;

/**
 * @Auther: zk
 * @Date: 2021/1/18 14:42
 * @Description:
 */
public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V; // 关联关系-聚合


    //通过构造器，传入一个 Voltage220V 实例
    public VoltageAdapter(Voltage220V voltage220v) {

        this.voltage220V = voltage220v;
    }

    @Override
    public int output5V() {
        // TODO Auto-generated method stub
        //获取到220V电压
        int src = voltage220V.output220V();
        int dstV = src / 44 ; //转成 5v
        return dstV;
    }
}
