package com.lcb.bridge_pattern;

/**
 * 模拟面条的种类
 */
public class NoodleStyle1 extends AbstractNoodle {

    public NoodleStyle1(Peppery style) {

        super(style);
    }

    @Override
    public void eat() {

        System.out.println("这是一碗" + super.style.style() + "的种类1面条");
    }

}
