package com.lcb.observer_pattern;

/**
 * @author lichangbao
 */
public class Product extends AbstractObservable {

    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        // 当name发生修改时，通知所有观察对象。
        notifyObservers(name);
    }

    public double getPrice() {
        return price;
    }

    /**
     * 调用该方法时触发，目标对象上所有已注册的观察者对象
     */
    public void setPrice(double price) {
        this.price = price;
        // 当price发生修改时，通知所有观察对象。
        notifyObservers(price);
    }
}
