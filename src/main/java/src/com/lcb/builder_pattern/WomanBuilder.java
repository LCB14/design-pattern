package src.com.lcb.builder_pattern;
/*
 * 
 * 模拟建造一个女性角色
 * 
 * 
 * */
public class WomanBuilder implements PersonBuilder {  
	   
   
    public void buildBody() {  
        System.out.println("建造身体部分(体量小)");  
    }  
   
    public void buildFoot() {  
        System.out.println("建造四肢部分(体量小)");
   
    }  
   
    public void buildHead() {  
        System.out.println("建造头部部分(体量小)"); 
       
    }  
   
} 