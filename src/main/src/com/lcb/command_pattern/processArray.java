package com.lcb.command_pattern;

public class processArray {
	
	//定义一个each方法，用于处理数组。
	public void each(int[] args,Command cmd) {
		
		cmd.process(args);
	}
}
