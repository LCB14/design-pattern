package com.lcb.composite_pattern;
/**
 * 
 * 模拟avi文件
 * 
 * */
public class AVIFile extends File{
	
    public AVIFile(String name) {
    	
        this.name = name;
    }

    @Override
    public void showFileName() {
    	
        System.out.println(this.name);
    }
}