package com.lcb.flyweight_pattern;
/**
 * 
 * 享元模式
 * 特点：为了减少内存消耗，将多个对象的相同部分集中起来，不必为每个对象的相同部分都重新申请内存空间，以此来降低内存的消耗。
 * 
 * */
public class FlyweightPattern {

	public static void main(String[] args) {
		
		String yundong ="足球";
		
        for(int i = 1;i <= 5;i++){
        	
            TiYuGuan tyg = JianZhuFactory.getTyg(yundong);
            tyg.setName("中国体育馆");
            tyg.setShape("圆形");
            tyg.use();
            System.out.println("对象池中对象数量为："+JianZhuFactory.getSize());
            
        }
	}

}
