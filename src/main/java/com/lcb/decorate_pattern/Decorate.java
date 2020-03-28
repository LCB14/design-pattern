package com.lcb.decorate_pattern;

/**
 * 装饰器
 * @author lichangbao
 */
public class Decorate implements Component {

    private Component component;

    /**
     * 装饰器模式的核心部分
     */
    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }

}
