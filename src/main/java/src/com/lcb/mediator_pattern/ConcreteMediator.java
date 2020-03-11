package src.com.lcb.mediator_pattern;

public class ConcreteMediator extends Mediator {
	
	private ColleagueA collA;
	private ColleagueB collB;
	
	//中介者核心代码部分
	@Override
	public void contact(String content, Colleague coll) {
		
		if(coll == collA) {
			
			collB.getMessage(content);
		}
		else {
			
			collA.getMessage(content);
		}

	}

	public void setCollA(ColleagueA collA) {
		
		this.collA = collA;
	}

	public void setCollB(ColleagueB collB) {
		
		this.collB = collB;
	}
	
}
