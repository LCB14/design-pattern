package com.lcb.bridge_pattern;

/**
 * 桥接模式（接口模式/柄体模式）
 * 特点：将变化部分抽象出来，使变化部分与主类分离。
 * 应用场景：JDBC就是典型的桥接模式
 */
public class BridgePattern {

    public static void main(String[] args) {

        //烹饪种类1面条（微辣）
        AbstractNoodle noodle1_1 = new NoodleStyle1(new PepperyStyle1());
        noodle1_1.eat();
        //烹饪种类1面条（中辣）
        AbstractNoodle noodle1_2 = new NoodleStyle1(new PepperyStyle2());
        noodle1_2.eat();
        //烹饪种类1面条（变态辣）
        AbstractNoodle noodle1_3 = new NoodleStyle1(new PepperyStyle3());
        noodle1_3.eat();


        //烹饪种类2面条（微辣）
        AbstractNoodle noodle2_1 = new NoodleStyle2(new PepperyStyle1());
        noodle2_1.eat();
        //烹饪种类2面条（中辣）
        AbstractNoodle noodle2_2 = new NoodleStyle2(new PepperyStyle2());
        noodle2_2.eat();
        //烹饪种类2面条（变态辣）
        AbstractNoodle noodle2_3 = new NoodleStyle2(new PepperyStyle3());
        noodle2_3.eat();
    }

}
