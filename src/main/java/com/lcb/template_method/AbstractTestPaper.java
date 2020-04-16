package com.lcb.template_method;

/**
 * 模拟试卷
 *
 * @author lichangbao
 */
public abstract class AbstractTestPaper {

    public void test1() {
        System.out.println("例：问题一");
        System.out.println("答案选择：" + "A");
    }

    public void test2() {
        System.out.println("例：问题二");
        System.out.println("答案选择：" + "B");
    }

    public void test3() {
        System.out.println("例：问题三");
        System.out.println("答案选择：" + "C");
    }

    public abstract void realTest1();

    public abstract void realTest2();

    public abstract void realTest3();
}
