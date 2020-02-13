package com.lcb.factory_method_pattern;
/*
 * 模拟联想牌打印机
 *
 * */
public class LenovoPrinter implements Printer {
	
	//代表缓存更大的打印机
	private String[] printdata = new String[MAX_CACHE_LINE*2];
	
	//用于记录待打印数据的条数
	private int datacount = 0;
	
	@Override
	public void out() {
		
		while(datacount>0) {
			
			System.out.println(printdata[0]);
			
			System.arraycopy(printdata, 1, printdata, 0, --datacount);
		}
		
	}

	@Override
	public void setData(String msg) {
		
		if(datacount>=2*MAX_CACHE_LINE) {
			
			System.out.println("缓存已满!");
			
		}else {
			
			//把待打印数据添加到缓存队列中
			printdata[datacount++] = msg;
		}
		
	}

}
