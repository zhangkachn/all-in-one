package com.设计模式.facade外观模式.mybatis在外观模式中的应用;

import org.apache.ibatis.session.Configuration;

/**
 * @Auther: zk
 * @Date: 2021/1/22 14:50
 * @Description:
 */
public class Facade {
    public static void main(String[] args) {
        // Configuration 是一个外观类，通过外观类来进行调用方法
        Configuration configuration=new Configuration();
    }
}
