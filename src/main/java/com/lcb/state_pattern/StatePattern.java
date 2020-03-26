package com.lcb.state_pattern;
/*
 * 
 * 状态模式
 * 特点：当一个对象的状态转换的条件表达式过于复杂时，把状态的判断逻辑转移到表示不同状态的一系列类当中。
 * 
 * */
public class StatePattern {

	public static void main(String[] args) {
		
		Context context = new Context();  
        //context.setLiftState(new ClosingState()); 
        //context.setLiftState(new OpenningState()); 
		context.setLiftState(new RunningState()); 
		
        context.open();  
        context.close();  
        context.run();  
        context.stop();
        
	}

}
