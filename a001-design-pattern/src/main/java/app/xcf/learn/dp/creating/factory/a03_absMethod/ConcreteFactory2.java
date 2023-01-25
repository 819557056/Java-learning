package app.xcf.learn.dp.creating.factory.a03_absMethod;

import app.xcf.learn.dp.creating.factory.a02_FactoryMethod.Product;

/**
 * @ClassName ConcreteFactory1
 * @Description TODO
 * @Author xcf
 * @Date 2023/1/25 下午9:20
 * @Version 1.0.0
 **/
public class ConcreteFactory2 implements AbsFactory {

    @Override
    public Product newProduct1() {
        System.out.println("具体工厂2生成-->具体产品21...");
        return new ConcreteProduct21();
    }

    @Override
    public Product newProduct2() {
        System.out.println("具体工厂2生成-->具体产品22...");
        return new ConcreteProduct22();
    }
}
