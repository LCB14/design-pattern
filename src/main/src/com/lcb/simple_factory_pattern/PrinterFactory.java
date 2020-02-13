package com.lcb.simple_factory_pattern;
/*
 * 
 * 模拟生产各种品牌打印机的工厂
 * 
 * */
public class PrinterFactory{
	
	public Printer getResource() {
		
		//通过修改此处即可让工厂动态生产各种品牌的打印机（可以通过工厂方法对这种模式进行升级）
//		return new HPPrinter();
		return new LenovoPrinter();
	}
}
