package com.lcb.template_method;

/**
 * 模拟student2获取试卷后的作答
 *
 * @author lichangbao
 */
public class Student2 extends AbstractTestPaper {

    @Override
    public void realTest1() {
        System.out.println("问题一");
        System.out.println("B");
    }

    @Override
    public void realTest2() {
        System.out.println("问题二");
        System.out.println("A");
    }

    @Override
    public void realTest3() {
        System.out.println("问题三");
        System.out.println("C");
    }

}
