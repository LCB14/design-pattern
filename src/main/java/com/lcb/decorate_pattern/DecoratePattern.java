package com.lcb.decorate_pattern;

/**
 * 装饰模式（包装模式）：在不改变对象的基础上、将功能附加到对象上。（开闭原则最佳体现）
 * 特点：动态地给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更为灵活。
 * 应用场景：Mybatis 的执行器设计 org.apache.ibatis.executor.CachingExecutor
 * 补存：除了使用装饰器模式，还使用了模板方法模式
 *
 * @author lichangbao
 */
public class DecoratePattern {

    public static void main(String[] args) {

        System.out.println("===============装饰者模式==================");

        // 待装饰对象
        Component person = new Person("孙少平");

        Component decorateA = new BaseDecoratorStyleA(person);
        Component decorateB = new BaseDecoratorStyleB(decorateA);

        decorateB.operation();

    }

}
