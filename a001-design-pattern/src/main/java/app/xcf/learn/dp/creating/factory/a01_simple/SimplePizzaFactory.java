package app.xcf.learn.dp.creating.factory.a01_simple;

import app.xcf.learn.dp.creating.model.CheesePizza;
import app.xcf.learn.dp.creating.model.GreekPizza;
import app.xcf.learn.dp.creating.model.PepperPizza;
import app.xcf.learn.dp.creating.model.Pizza;

/**
 * 简单工厂
 * @ClassName SimplePizzaFactory
 * @Description TODO
 * @Author xcf
 * @Date 2023/1/25 下午7:37
 * @Version 1.0.0
 **/
public class SimplePizzaFactory implements OrderPizza {

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new GreekPizza();
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
        }
        return pizza;
    }

}
