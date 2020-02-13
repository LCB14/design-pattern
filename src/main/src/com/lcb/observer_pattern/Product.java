package com.lcb.observer_pattern;

public class Product extends Observable {
	
	private String name;
	private double price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String name,double price){
		
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		
		this.name = name;
		notifyObservers(name);//当name发生修改时，通知所有观察对象。
	}
	
	public double getPrice() {
		
		return price;
	}
	//调用该方法时触发，目标对象上所有已注册的观察者对象
	public void setPrice(double price) {
		
		this.price = price;
		notifyObservers(price);//当price发生修改时，通知所有观察对象。
	}
}
