package com.lcb.strategy_pattern;
/*
 * 
 * 策略二
 * 
 * */
public class Strategy2 implements DiscountStrategy {

	@Override
	public double getDiscount(double price) {
		
		System.out.println("使用策略二进行图书打折....");
		return price*0.5;
	}

}
