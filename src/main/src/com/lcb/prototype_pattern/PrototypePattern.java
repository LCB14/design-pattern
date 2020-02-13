package com.lcb.prototype_pattern;
/*
 * 
 * 原型模式
 * 特点：减少多次创建类似对象给系统带来的开销。
 * 
 * */
public class PrototypePattern {

	public static void main(String[] args) {
		
		ConcretePrototype cp = new ConcretePrototype();  
		
        for(int i=0; i< 10; i++){  
        	
            ConcretePrototype clonecp = (ConcretePrototype)cp.clone();  
            
            clonecp.setVariable(""+i);
            clonecp.show();  
            
        }  
	}

}
