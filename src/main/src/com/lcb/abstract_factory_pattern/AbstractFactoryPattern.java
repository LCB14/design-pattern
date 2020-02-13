package com.lcb.abstract_factory_pattern;

/*
 * 
 * 抽象工厂模式
 * 特点：可以看成是简单工厂模式与工厂方法模式的结合
 * 
 * */
public class AbstractFactoryPattern {

private Printer printer;
	
	public AbstractFactoryPattern(Printer printer) {
		
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
		FactoryFactory ff = new FactoryFactory();
		FactoryManger pf = ff.getFactory("HP");
//		FactoryManger pf = ff.getFactory("Lenovo");
		
		AbstractFactoryPattern sfp = new AbstractFactoryPattern(pf.getPrinter());
		
		sfp.loaddata("宾夕法尼亚大学，计算机的诞生地！");
		sfp.loaddata("斯坦福大学，一所值得人们尊敬的大学！");
		
		sfp.out();
		
	}

}
