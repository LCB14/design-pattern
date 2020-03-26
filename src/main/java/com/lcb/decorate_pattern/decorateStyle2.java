package com.lcb.decorate_pattern;

/**
 * 装饰2
 */
public class decorateStyle2 extends Decorate {

    @Override
    public void operation() {

        super.operation();
        System.out.println("给待装饰对象穿上鞋子...");
    }
}
