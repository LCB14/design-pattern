package src.com.lcb.decorate_pattern;
/*
 * 
 * 具体装饰对象
 * 
 * */
public class baseDecorate implements Component {

	@Override
	public void operation() {
		
		System.out.println("待装饰对象....");

	}

}
