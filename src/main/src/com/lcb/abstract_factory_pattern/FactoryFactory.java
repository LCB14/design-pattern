package com.lcb.abstract_factory_pattern;

public class FactoryFactory {
	
	public FactoryManger getFactory(String brand) {

		if(brand.equals("HP")) {
			
			return new HPFactory();
			
		}else {
			
			return new LenovoFactory();
			
		}
	}
}
