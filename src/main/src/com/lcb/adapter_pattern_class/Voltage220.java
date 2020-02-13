package com.lcb.adapter_pattern_class;
//待适配的类
public class Voltage220 {
	
    public int output220V() {
        int src = 220;
        System.out.println("我是" + src + "V");
        return src;
    }
}