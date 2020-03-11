package src.com.lcb.prototype_pattern;

class ConcretePrototype extends Prototype{  
	
	private String variable;
	
    public void show(){  
    	
        System.out.println("相同部分and"+"不同部分"+variable); 
        
    }  
    
    public void setVariable(String variable) {
    	
    	this.variable = variable;
    }
} 