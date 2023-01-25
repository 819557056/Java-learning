package app.xcf.learn.dp.creating.factory.a03_absMethod;

import app.xcf.learn.dp.creating.factory.a02_FactoryMethod.AbstractFactory;
import app.xcf.learn.dp.creating.factory.a02_FactoryMethod.ConcreteProduct1;
import app.xcf.learn.dp.creating.factory.a02_FactoryMethod.Product;

/**
 * @ClassName ConcreteFactory1
 * @Description TODO
 * @Author xcf
 * @Date 2023/1/25 下午9:20
 * @Version 1.0.0
 **/
public class ConcreteFactory1 implements AbsFactory {

    @Override
    public Product newProduct1() {
        System.out.println("具体工厂1生成-->具体产品11...");
        return new ConcreteProduct11();
    }

    @Override
    public Product newProduct2() {
        System.out.println("具体工厂1生成-->具体产品12...");
        return new ConcreteProduct12();
    }
}
