package src.com.lcb.visitor_pattern;
/**
 * 
 * 访问者模式
 * 特点：利用重载的特性
 * 
 * */
public class VisitorPattern {

	public static void main(String[] args) {
		
		ComputerPart computer = new Computer();
		
	    computer.accept(new ComputerPartDisplayVisitor());
	}

}
