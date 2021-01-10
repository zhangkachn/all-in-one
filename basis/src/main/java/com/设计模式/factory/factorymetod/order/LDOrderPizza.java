package com.设计模式.factory.factorymetod.order;

import com.设计模式.factory.factorymetod.pizza.LDCheesePizza;
import com.设计模式.factory.factorymetod.pizza.LDPepperPizza;
import com.设计模式.factory.factorymetod.pizza.Pizza;

/**
 * @Auther: zk
 * @Date: 2021/1/10 13:31
 * @Description:
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }
}
