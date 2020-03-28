package com.lcb.decorate_pattern;

/**
 * 具体装饰对象
 */
public class BaseDecorate implements Component {

    @Override
    public void operation() {
        System.out.println("待装饰者....");
    }

}
