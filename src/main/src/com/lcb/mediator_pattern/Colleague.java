package com.lcb.mediator_pattern;
//定义抽象同事类
public class Colleague {
	
    protected String name;
    protected Mediator mediator;

    public Colleague(String name, Mediator mediator) {
    	
        this.name = name;
        this.mediator = mediator;
    }
}