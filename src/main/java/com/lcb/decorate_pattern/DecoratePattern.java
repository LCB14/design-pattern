package com.lcb.decorate_pattern;

/**
 * 装饰模式
 * 特点：动态地给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更为灵活。
 */
public class DecoratePattern {

    public static void main(String[] args) {

        System.out.println("===============装饰者模式==================");
        //待装饰对象
        baseDecorate basedecorate = new baseDecorate();

        //装饰“职责”
        decorateStyle1 style1 = new decorateStyle1();
        decorateStyle2 style2 = new decorateStyle2();

        //进行装饰
        style1.setComponent(basedecorate);//用style1来包装basedecorate
        style2.setComponent(style1);//用style2来包装style1
        style2.operation();

    }

}
