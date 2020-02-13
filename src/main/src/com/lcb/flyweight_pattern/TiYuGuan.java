package com.lcb.flyweight_pattern;

public class TiYuGuan implements Jianzhu {
	
    private String name;
    private String shape;
    private String yundong;
    
    public TiYuGuan(String yundong){
    	
        this.setYundong(yundong);
    }
    
    public String getName() {
    	
        return name;
    }
    
    public void setName(String name) {
    	
        this.name = name;
    }
    
    public String getShape() {
    	
        return shape;
    }
    
    public void setShape(String shape) {
    	
        this.shape = shape;
    }
    
    public String getYundong() {
    	
        return yundong;
    }
    
    public void setYundong(String yundong) {
    	
        this.yundong = yundong;
    }
    
    @Override
    public void use() {
    	
        System.out.println("该体育馆被使用来召开奥运会" + "  运动为："+ yundong+"  形状为："+shape+ "  名称为："+name);
    }
}