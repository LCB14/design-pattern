package src.com.lcb.interpreter_pattern;
/**
 * 
 * 声明一个抽象的解释器操作
 * 
 * */
public interface Expression {
	
   public boolean interpret(String context);
}