package com.设计模式.factory.factorymetod.order;

import com.设计模式.factory.factorymetod.pizza.BJCheesePizza;
import com.设计模式.factory.factorymetod.pizza.BJPepperPizza;
import com.设计模式.factory.factorymetod.pizza.Pizza;

/**
 * @Auther: zk
 * @Date: 2021/1/10 13:30
 * @Description: 作为子类
 *
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }
}
