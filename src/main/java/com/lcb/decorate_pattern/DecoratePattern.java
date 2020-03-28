package com.lcb.decorate_pattern;

/**
 * 装饰模式
 * 特点：动态地给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更为灵活。
 * 应用场景：Mybatis 缓存
 */
public class DecoratePattern {

    public static void main(String[] args) {

        System.out.println("===============装饰者模式==================");

        // 待装饰对象
        Component basedecorate = new BaseDecorate();

        // 装饰“职责”
        Decorate style1 = new DecorateStyle1();
        Decorate style2 = new DecorateStyle2();

        // 进行装饰
        // 用style1来包装basedecorate
        style1.setComponent(basedecorate);

        // 用style2来包装style1
        style2.setComponent(style1);
        style2.operation();

    }

}
