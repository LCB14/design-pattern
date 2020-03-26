package com.lcb.facade_pattern;
/*
 * 
 * 用于模拟门面的类
 * 
 * */
public class Facade {
	
	Payment payment;
	Cook cook;
	Waiter waiter;
	
	public Facade() {
		
		this.payment = new PaymentImp();
		this.cook = new CookImp();
		this.waiter = new WaiterImp();
	}
	
	public void servedFood() {
		
		//依次调用三个部门中的方法实现，完成用户用餐
		String food = payment.pay();
		food = cook.cook(food);
		waiter.serve(food);
		
	}
}
