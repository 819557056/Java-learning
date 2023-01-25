package app.xcf.learn.dp.creating.factory.a03_absMethod.demo;

/**
 * @ClassName Test
 * @Description TODO
 * @Author xcf
 * @Date 2023/1/25 下午10:02
 * @Version 1.0.0
 **/
public class Test {
    public static void main(String[] args) {
        Farm f;
        Animal a;
        Plant p;
        //f = new SgFarm();
        f = new SrFarm();
        a = f.newAnimal();
        p = f.newPlant();
        a.show();
        p.show();
    }
}
