package com.设计模式.prototype原型模式.deepclone深拷贝;

import java.io.Serializable;

/**
 * @Auther: zk
 * @Date: 2021/1/15 15:13
 * @Description:
 */
public class DeepCloneableTarget implements Serializable, Cloneable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String cloneName;

    private String cloneClass;

    //构造器
    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    //因为该类的属性，都是String , 因此我们这里使用默认的clone完成即可
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
