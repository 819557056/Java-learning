package app.xcf.learn.dp.creating.factory.a03_absMethod.demo;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName Horse
 * @Description TODO
 * @Author xcf
 * @Date 2023/1/25 下午9:49
 * @Version 1.0.0
 **/
public class Cattle implements Animal{

    JScrollPane sp;
    JFrame jf = new JFrame("抽象工厂模式测试");

    Cattle() {
        Container container = jf.getContentPane();
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1,1));
        p1.setBorder(BorderFactory.createTitledBorder("动物: 牛"));
        sp = new JScrollPane(p1);
        container.add(sp, BorderLayout.CENTER);
        JLabel l1 = new JLabel(new ImageIcon("A_Cattle.jpg"));
        p1.add(l1);
        jf.pack();
        jf.setVisible(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void show() {
        System.out.println("");
        jf.setVisible(true);
    }
}
