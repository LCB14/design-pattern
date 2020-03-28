package com.lcb.decorate_pattern;

/**
 * 装饰2
 * @author lichangbao
 */
public class DecorateStyleB extends Decorate {

    @Override
    public void operation() {
        super.operation();
        System.out.println("给待装饰对象穿上揽工服饰...");
    }
}
