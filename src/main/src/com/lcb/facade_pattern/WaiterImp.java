package com.lcb.facade_pattern;

public class WaiterImp implements Waiter {
	
	//模拟服务员上菜的方法
	@Override
	public String serve(String food) {
		
		System.out.println("服务员端上"+food+"请您慢用！");
		return food;
	}

}
