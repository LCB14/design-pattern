package com.lcb.facade_pattern;

public class Customer {
	
	public void haveDrinner() {
		
		/*不适用门面模式
		//依次创建三个部分实例
		Payment payment = new PaymentImp();
		Cook cook = new CookImp();
		Waiter waiter = new WaiterImp();
		
		//依次调用三个部门中的方法实现，完成用户用餐
		String food = payment.pay();
		food = cook.cook(food);
		waiter.serve(food);*/
		
		//使用门面模式
		Facade facade = new Facade();
		facade.servedFood();
	}
}
