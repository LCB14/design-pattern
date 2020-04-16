package com.lcb.template_method;

/**
 * 模拟试卷
 *
 * @author lichangbao
 */
public abstract class AbstractTestPaper {

    public void test1() {

        System.out.println("问题一");
        System.out.println("答案选择：" + Answer1());
    }

    public void test2() {

        System.out.println("问题二");
        System.out.println("答案选择：" + Answer2());
    }

    public void test3() {

        System.out.println("问题三");
        System.out.println("答案选择：" + Answer3());
    }

    public abstract String Answer1();

    public abstract String Answer2();

    public abstract String Answer3();
}
