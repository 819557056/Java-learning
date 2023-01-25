package app.xcf.learn.dp.creating.factory.a02_FactoryMethod;

/**
 * @ClassName AbstractFactoryTest
 * @Description TODO
 * @Author xcf
 * @Date 2023/1/25 下午9:18
 * @Version 1.0.0
 **/
public class AbstractFactoryTest {

    public static void main(String[] args) {

        Product p;
        //AbstractFactory aFactory = new ConcreteFactory1();
        AbstractFactory aFactory = new ConcreteFactory2();
        p = aFactory.newProduct();
        p.show();
    }

}
