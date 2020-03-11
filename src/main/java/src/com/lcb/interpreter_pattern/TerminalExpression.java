package src.com.lcb.interpreter_pattern;
/**
 * 
 * 模拟一个“终端”实现
 * 
 * */
public class TerminalExpression implements Expression {
    
   private String data;

   public TerminalExpression(String data){
	   
      this.data = data; 
   }

   @Override
   public boolean interpret(String context) {
	   
      if(context.contains(data)){
    	  
         return true;
      }
      
      return false;
   }
}