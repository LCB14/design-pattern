package com.lcb.template_method;

/**
 * 模板方法模式
 * 特点：子类可以在不改变一个算法的结构即可重定义该算法的某些特定步骤。
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

        System.out.println("-----------------------");

        //学生2的作答
        System.out.println("学生2的答案如下：");
        AbstractTestPaper abstractTestPaper2 = new Student2();
        abstractTestPaper2.test1();
        abstractTestPaper2.test2();
        abstractTestPaper2.test3();

    }
}
