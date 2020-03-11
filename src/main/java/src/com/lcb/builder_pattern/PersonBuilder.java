package src.com.lcb.builder_pattern;
/*
 * 
 * 抽象出建造游戏人物身体的基本步骤
 * 
 * 
 * */
public interface PersonBuilder {  
	
    void buildHead();  
    void buildBody();  
    void buildFoot();  
}  