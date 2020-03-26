package com.lcb.strategy_pattern;
/*
 * 
 * 用于切换不同的策略,扮演决策者。
 * 
 * 
 * */
public class DiscountContext {
	
	private DiscountStrategy strategy;
	
	public DiscountContext(DiscountStrategy strategy) {
		
		this.strategy = strategy;
	}
	
	//根据实际使用的Strategy，得到相应的折扣价
	public double getDiscountPrice(double price) {
		
		//如果用户不进行任何策略选择，默认选择strategy1
		if(strategy==null) {
			
			strategy = new Strategy1();
		}
		
		return strategy.getDiscount(price);
	}
	
	//负责切换不同的策略
	public void changeDiscountStrategy(DiscountStrategy strategy) {
		
		this.strategy = strategy;
	}
	
}
