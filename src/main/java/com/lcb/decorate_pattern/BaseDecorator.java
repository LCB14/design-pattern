package com.lcb.decorate_pattern;

/**
 * 装饰器
 * @author lichangbao
 */
abstract class BaseDecorator implements Component {

    public Component component;

    public BaseDecorator(Component component) {
        this.component = component;
    }
}
