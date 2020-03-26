package com.lcb.abstract_factory_pattern;

/*
 * 
 * 创建HP工厂，专用于生产HP牌打印机。
 * 
 * */
public class HPFactory implements FactoryManger {

	@Override
	public Printer getPrinter() {
		
		return new HPPrinter();
	}

}
