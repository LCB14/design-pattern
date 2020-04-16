package com.lcb.template_method;

/**
 * 模板方法模式
 * 特点：对公共部分进行抽取使其成为模板、变化部分进行抽象。
 * 应用场景：Mybatis 的 Executor 执行器。
 *
 * @author lichangbao
 */
public class TemplateMethodPattern {

    public static void main(String[] args) {

        //学生1的作答
        System.out.println("学生1的答案如下：");
        AbstractTestPaper abstractTestPaper1 = new Student1();
        abstractTestPaper1.test1();
        abstractTestPaper1.test2();
        abstractTestPaper1.test3();
        abstractTestPaper1.realTest1();
        abstractTestPaper1.realTest2();
        abstractTestPaper1.realTest3();

        System.out.println("-----------------------");

        //学生2的作答
        System.out.println("学生2的答案如下：");
        AbstractTestPaper abstractTestPaper2 = new Student2();
        abstractTestPaper2.test1();
        abstractTestPaper2.test2();
        abstractTestPaper2.test3();
        abstractTestPaper2.realTest1();
        abstractTestPaper2.realTest2();
        abstractTestPaper2.realTest3();
    }
}
