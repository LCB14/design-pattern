package com.lcb.strategy_pattern;

/*
 * 
 * 策略一
 * 
 * */
public class Strategy1 implements DiscountStrategy {

	@Override
	public double getDiscount(double price) {
		
		System.out.println("使用策略一进行图书打折....");
		return price*0.8;
	}

}
