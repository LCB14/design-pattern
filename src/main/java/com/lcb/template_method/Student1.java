package com.lcb.template_method;

/**
 * 模拟student1获取试卷后的作答
 *
 * @author lichangbao
 */
public class Student1 extends AbstractTestPaper {

    @Override
    public String Answer1() {
        return "a";
    }

    @Override
    public String Answer2() {
        return "b";
    }

    @Override
    public String Answer3() {
        return "c";
    }

}
