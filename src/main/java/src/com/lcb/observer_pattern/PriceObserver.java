package src.com.lcb.observer_pattern;

public class PriceObserver implements Observer {

	@Override
	public void update(Observable o, Object args) {
		
		if(args instanceof Double) {
			
			Double price = (Double)args;
			System.out.println("被观察者："+o+":"+"物品价格已改为"+price);
		}

	}

}
