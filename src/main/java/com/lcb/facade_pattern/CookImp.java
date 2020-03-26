package com.lcb.facade_pattern;

public class CookImp implements Cook {
	
	//模拟烹调食物的方法
	@Override
	public String cook(String food) {
		
		System.out.println("厨师正在烹饪"+food);
		return food;
	}

}
