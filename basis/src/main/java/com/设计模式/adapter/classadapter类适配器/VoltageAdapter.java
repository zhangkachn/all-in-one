package com.设计模式.adapter.classadapter类适配器;

/**
 * @Auther: zk
 * @Date: 2021/1/18 14:42
 * @Description:
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        // TODO Auto-generated method stub
        //获取到220V电压
        int srcV = output220V();
        int dstV = srcV / 44 ; //转成 5v
        return dstV;
    }
}
