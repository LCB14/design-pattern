package src.com.lcb.abstract_factory_pattern;

/*
 * 
 * 模拟工厂管理机构。
 * 
 * */
public interface FactoryManger {
	
	//表示将设立的工厂是用来生产打印机的
	public Printer getPrinter();
	
}
