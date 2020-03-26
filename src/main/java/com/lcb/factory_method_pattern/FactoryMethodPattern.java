package com.lcb.factory_method_pattern;

/*
 * 
 * 工厂方法模式
 * 特点：相对于简单工厂模式，该模式会让实例的调用者直接与具体的工厂类进行耦合，使代码更可读。
 * 
 * */
public class FactoryMethodPattern {
	
	private Printer printer;
	
	public FactoryMethodPattern(Printer printer) {
		
		this.printer = printer;
		
	}
	
	//输出数据
	public void out() {
		
		printer.out();
	}
	
	//装载数据
	public void loaddata(String msg) {
		
		printer.setData(msg);
	}
	
	public static void main(String[] args) {
		
		//通过在此处切换工厂，达到切换产品的目的。
//		FactoryManger pf = new HPFactory();
		FactoryManger pf = new LenovoFactory();
		FactoryMethodPattern sfp = new FactoryMethodPattern(pf.getPrinter());
		
		sfp.loaddata("宾夕法尼亚大学，计算机的诞生地！");
		sfp.loaddata("斯坦福大学，一所值得人们尊敬的大学！");
		
		sfp.out();
		
	}

}
