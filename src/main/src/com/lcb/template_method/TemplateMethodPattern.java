package com.lcb.template_method;
/*
 * 
 * 模板方法模式
 * 特点：子类可以在不改变一个算法的结构即可重定义该算法的某些特定步骤。
 * 
 * */
public class TemplateMethodPattern {
	
	public static void main(String[] args) {
		
		//学生1的作答
		System.out.println("学生1的答案如下：");
		TestPaper testPaper1 = new Student1();
		testPaper1.test1();
		testPaper1.test2();
		testPaper1.test3();
		System.out.println("-----------------------");
		//学生2的作答
		System.out.println("学生2的答案如下：");
		TestPaper testPaper2 = new Student2();
		testPaper2.test1();
		testPaper2.test2();
		testPaper2.test3();
		
	}
}
