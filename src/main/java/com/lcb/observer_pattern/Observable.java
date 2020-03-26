package com.lcb.observer_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * 
 * 监测器，用于注册和移除观察对象，并对已注册观察对象进行通知。
 * 
 * */
public abstract class Observable {
	
	//用一个List来保存该对象上所有绑定的事件监听器
	List<Observer> observers = new ArrayList<Observer>();
	
	//用于向目标对象中注册观察者对象
	public void registerObserver(Observer o) {
		
		observers.add(o);
	}
	
	//用于向目标对象中移除观察者对象
	public void removeObserver(Observer o) {
		
		observers.remove(o);
	}
	
	//用于通知目标对象上所有注册的观察者对象
	public void notifyObservers(Object value) {
		
		//遍历所有注册到目标对象上的观察者对象
		Iterator<Observer> it = observers.iterator();
		while(it.hasNext()) {
			
			Observer observer = (Observer)it.next();
			//显示每个观察者的update方法
			observer.update(this, value);
		}
	}
}
