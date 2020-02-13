package com.lcb.prototype_pattern;

class Prototype implements Cloneable {
	
    public Prototype clone(){  
    	
        Prototype prototype = null;  
        
        try{  
        	
            prototype = (Prototype)super.clone();  
            
        }catch(CloneNotSupportedException e){  
        	
            e.printStackTrace();  
            
        }  
        
        return prototype;   
    }  
}  