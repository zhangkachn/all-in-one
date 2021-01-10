package com.zhangkachn.枚举;

/**
 * @Auther: zk
 * @Date: 2020/12/29 15:47
 * @Description: 枚举构造方法构建，是在创建枚举时候就确定的了
 */
public enum People {
    Zhangsan("hello"),LISI("sd"),wangwu("sd");
    private String value;
    public String getValue(){
        return value;
    }
     People(String value){
           this.value=value;
    }

    public static void main(String[] args) {
     People wangwu=People.wangwu;
        String value = wangwu.getValue();
        System.out.println(value);
    }
}
