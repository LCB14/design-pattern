package src.com.lcb.builder_pattern;
/*
 * 
 * 建造者模式（生成器模式）
 * 特点：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示意图。
 * 
 * */
public class BuilderPattern {

	public static void main(String[] args) {
		
	   //建造男性角色
	   System.out.println("建造男性角色:");
	   PersonDirector cm = new PersonDirector();  
       cm.constructPerson(new ManBuilder()); 
       
       System.out.println("---------------------------");
       
       //建造女性角色
       System.out.println("建造女性角色:");
       PersonDirector cw = new PersonDirector();  
	   cw.constructPerson(new WomanBuilder()); 
	}

}
