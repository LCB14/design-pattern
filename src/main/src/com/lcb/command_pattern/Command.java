package com.lcb.command_pattern;

public interface Command {
	
	//接口里定义process方法，用于封装“处理行为”
	public void process(int[] args);
}
