package com.lcb.strategy_pattern;

public interface DiscountStrategy {
	
	//定义一个用于计算经过打折后图书价格的方法
	public double getDiscount(double price);
}
