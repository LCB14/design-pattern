package src.com.lcb.factory_method_pattern;
/*
 * 
 * 模拟打印机应有的基本功能
 * 
 * */
public interface Printer {
	
	public final int MAX_CACHE_LINE = 1;
	
	//输出数据
	public void out();
	
	//添加数据
	public void setData(String msg);
}
