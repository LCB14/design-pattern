package com.lcb.abstract_factory_pattern;
/*
 * 
 * 模拟惠普牌打印机
 * 
 * */
public class HPPrinter implements Printer {

	private String[] printdata = new String[MAX_CACHE_LINE];
	
	//用于记录待打印数据的条数
	private int datacount = 0;
	
	@Override
	public void out() {
		
		while(datacount>0) {
			
			System.out.println(printdata[0]);
			
			//对缓存队列中的数据进行移动
			System.arraycopy(printdata, 1, printdata, 0, --datacount);
		}
		
	}

	@Override
	public void setData(String msg) {
		
		if(datacount>=MAX_CACHE_LINE) {
			
			System.out.println("打印机，缓存已满!");
			
		}else {
			
			//把待打印数据添加到缓存队列中
			printdata[datacount++] = msg;
			
		}
		
	}

}
