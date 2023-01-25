package app.xcf.learn.dp.creating.factory.a03_absMethod.demo;

/**
 * @ClassName SgFarm
 * @Description TODO
 * @Author xcf
 * @Date 2023/1/25 下午10:00
 * @Version 1.0.0
 **/
public class SgFarm implements Farm{
    @Override
    public Animal newAnimal() {
        System.out.println("新牛出生!");
        return new Cattle();
    }

    @Override
    public Plant newPlant() {
        System.out.println("蔬菜好了!");
        return new Vegetables();
    }
}
