package src.com.lcb.facade_pattern;

public class PaymentImp implements Payment {
	
	//模拟顾客支付费用的方法
	@Override
	public String pay() {
		
		String food = "汉堡";
		System.out.println("您向收银人员支付了现金，您所购买的食物是"+food);
		
		return food;
	}

}
