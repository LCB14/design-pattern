package com.lcb.observer_pattern;

public class NameObserver implements Observer {

	@Override
	public void update(Observable o, Object args) {
		
		if(args instanceof String) {//通过args参数来判断是否是否是自己监测的属性发生了改变
			
			String name = (String)args;
			System.out.println("被观察者："+o+":"+"物品名称已改为"+name);
		}

	}

}
