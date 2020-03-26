package com.lcb.command_pattern;

/*
 * 
 * 命令模式
 * 特点：
 * 
 * */
public class CommandPattern {

	
		public static void main(String[] args) {
			
			processArray process = new processArray();
			int[] target= {3,-4,6,4};
			
			//操作数组的方式一
			process.each(target, new Command() {
				
				@Override
				public void process(int[] args) {
					
					for(int temp:args) {
						
						System.out.println("遍历数组中的元素："+temp);
					}
					
				}
			});
			
			//操作数组的方式二
			process.each(target, new Command() {
				
				@Override
				public void process(int[] args) {
					int sum = 0;
					for(int temp:args) {
						
						sum+=temp;
					}
					System.out.println("数组元素之和："+sum);
				}
				
			});
		}
		
}
