package com.lcb.decorate_pattern;

/**
 * 具体装饰对象
 *
 * @author lichangbao
 */
public class Person implements Component {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("待装饰者:" + name);
    }

}
