package com.lcb.decorate_pattern;

/**
 * 装饰模式
 * 特点：动态地给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更为灵活。
 * 应用场景：Mybatis sql 执行器 org.apache.ibatis.executor.Executor
 * @author lichangbao
 */
public class DecoratePattern {

    public static void main(String[] args) {

        System.out.println("===============装饰者模式==================");

        // 待装饰对象
        Component person = new Person("孙少平");

        System.out.println("第一种装扮：");
        Decorate decorateA = new DecorateStyleA();
        decorateA.wrapperComponent(person);
        decorateA.operation();


        System.out.println("第二种装扮：");
        Decorate decorateB = new DecorateStyleB();
        decorateB.wrapperComponent(person);
        decorateB.operation();

    }

}
