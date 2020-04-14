package com.lcb.decorate_pattern;

/**
 * 装饰1
 * @author lichangbao
 */
public class DecoratorStyleA extends Decorator {

    @Override
    public void operation() {
        super.operation();
        System.out.println("给待装饰对象穿上下矿服饰...");
    }
}
