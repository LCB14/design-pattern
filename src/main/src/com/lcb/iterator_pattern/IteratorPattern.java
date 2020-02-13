package com.lcb.iterator_pattern;
/**
 * 
 * 迭代器模式
 * 特点：提供一种方法顺序访问一个聚合对象中各个元素，而又不暴露该对象的内部表示。
 * java已经帮我们实现了此种模式，遍历集合时可以直接使用，当然学习此种设计模式也就了解了java中Iterator的原理。
 * 
 * */
public class IteratorPattern {

	public static void main(String[] args) {
		
		List list=new ConcreteAggregate();
		
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        
        Iterator it=list.iterator();
        
        while(it.hasNext()){
        	
            System.out.println(it.next());
        }

	}

}
