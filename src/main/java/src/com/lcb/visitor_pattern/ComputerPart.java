package src.com.lcb.visitor_pattern;

public interface ComputerPart {
	
   public void accept(ComputerPartVisitor computerPartVisitor);
   
}