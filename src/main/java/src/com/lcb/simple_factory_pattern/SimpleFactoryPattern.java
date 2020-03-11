package src.com.lcb.simple_factory_pattern;
/*
 * 
 * 简单工厂模式
 * 特点：让对象的调用者和对象的创建过程分离，达到解耦的目的。
 * 
 * */
public class SimpleFactoryPattern {

	private Printer printer;
	
	public SimpleFactoryPattern(Printer printer) {
		
		this.printer = printer;//问题：java多态中进行上行转换后，父类对象能够准确调用指定子类对象中的方法的原理？
		
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
		
		PrinterFactory pf = new PrinterFactory();
		
		SimpleFactoryPattern sfp = new SimpleFactoryPattern(pf.getResource());
		
		sfp.loaddata("宾夕法尼亚大学，计算机的诞生地！");
		sfp.loaddata("斯坦福大学，一所值得人们尊敬的大学！");
		
		sfp.out();
		
	}
	
}
