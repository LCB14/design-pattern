package com.lcb.singleton_pattern;
/*
 * 单例模式
 *特点：
 *
 **/
public class SingletonPattern {

	public static void main(String[] args) {
		
		Singleton sp1 = Singleton.getInstance();
		Singleton sp2 = Singleton.getInstance();
		
		System.out.println(sp1==sp2);
	}

}

class Singleton{
	
	public static Singleton instance;//2.声明存放目标实例的（静态）变量
	
	private Singleton() {}//1.将构造函数（private）
	
	public static Singleton getInstance() {//3.设置获取目标实例的（静态）方法
		
		if(instance==null) {
			
			instance = new Singleton();
		}
		
		return instance;
	}
}