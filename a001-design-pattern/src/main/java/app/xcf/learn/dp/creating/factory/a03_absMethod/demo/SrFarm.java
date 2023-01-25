package app.xcf.learn.dp.creating.factory.a03_absMethod.demo;

/**
 * @ClassName SgFarm
 * @Description TODO
 * @Author xcf
 * @Date 2023/1/25 下午10:00
 * @Version 1.0.0
 **/
public class SrFarm implements Farm{
    @Override
    public Animal newAnimal() {
        System.out.println("新马出生!");
        return new Cattle();
    }

    @Override
    public Plant newPlant() {
        System.out.println("水果好了!");
        return new Vegetables();
    }
}
