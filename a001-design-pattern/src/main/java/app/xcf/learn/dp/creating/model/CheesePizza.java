package app.xcf.learn.dp.creating.model;

import lombok.Data;

/**
 * @ClassName CheesePizza
 * @Description TODO
 * @Author xcf
 * @Date 2023/1/25 下午7:38
 * @Version 1.0.0
 **/
@Data
public class CheesePizza extends Pizza {
    private String name;
    private int age;
    private String address;

    @Override
    public void bake() {

    }

    @Override
    public void box() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void prepaare() {

    }
}
