package com.lcb.decorate_pattern;

/**
 * 装饰2
 * @author lichangbao
 */
public class BaseDecoratorStyleB extends BaseDecorator {

    public BaseDecoratorStyleB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        component.operation();
        System.out.println("给待装饰对象穿上鞋子...");
    }
}
