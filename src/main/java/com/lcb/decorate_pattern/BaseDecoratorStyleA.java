package com.lcb.decorate_pattern;

/**
 * 装饰1
 * @author lichangbao
 */
public class BaseDecoratorStyleA extends BaseDecorator {

    public BaseDecoratorStyleA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        component.operation();
        System.out.println("给待装饰对象穿上裤子...");
    }
}
