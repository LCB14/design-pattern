package src.com.lcb.strategy_pattern;
/*
 * 
 * 策略模式
 * 特点：封装了变化
 * 
 * */
public class StrategyPattern {

	public static void main(String[] args) {
		
		DiscountContext discountContext = new DiscountContext(null);
		double bookprice = 79;
		
		//使用默认策略
		System.out.println("使用Strategy1进行价格计算(八折)："+discountContext.getDiscountPrice(bookprice));
		
		//切换策略
		discountContext.changeDiscountStrategy(new Strategy2());
		//使用策略二
		System.out.println("使用Strategy2进行价格计算（五折）："+discountContext.getDiscountPrice(bookprice));

	}

}
