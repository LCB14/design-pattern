package src.com.lcb.observer_pattern;
/*
 * 
 * 观察者模式
 * 特点：当一个对象变化时，其它依赖该对象的对象都会受到通知，并且随着变化，对象之间是一种一对多的关系。
 * 
 * */
public class ObserverPattern {

	public static void main(String[] args) {
		
		//创建被观察者对象
		Product product = new Product("电视机",19999);
		
		//创建两个观察者对象
		NameObserver nObserver = new NameObserver();
		PriceObserver pObserver = new PriceObserver();
		
		//向被观察者对象上注册两个观察者对象
		product.registerObserver(nObserver);
		product.registerObserver(pObserver);
		
		product.setName("书桌");
		product.setPrice(500);
		

	}

}
