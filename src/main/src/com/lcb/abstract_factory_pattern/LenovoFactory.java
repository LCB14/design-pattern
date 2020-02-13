package com.lcb.abstract_factory_pattern;
/*
 * 
 * 创建Lenovo工厂，用于生产Lenovo牌打印机。
 * 
 * */
public class LenovoFactory implements FactoryManger {

	@Override
	public Printer getPrinter() {
		
		return new LenovoPrinter();
	}
}
