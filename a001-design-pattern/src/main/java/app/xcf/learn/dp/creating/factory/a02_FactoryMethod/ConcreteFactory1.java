package app.xcf.learn.dp.creating.factory.a02_FactoryMethod;

/**
 * @ClassName ConcreteFactory1
 * @Description TODO
 * @Author xcf
 * @Date 2023/1/25 下午9:20
 * @Version 1.0.0
 **/
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProduct1();
    }
}
