package com.lcb.composite_pattern;
/**
 * 
 * 模拟文件特性
 * 
 * */
public abstract class File {

    protected String name;
    
    public String getName() {
    	
        return name;
    }

    public void setName(String name) {
    	
        this.name = name;
    }

    public abstract void showFileName();
    
    
}