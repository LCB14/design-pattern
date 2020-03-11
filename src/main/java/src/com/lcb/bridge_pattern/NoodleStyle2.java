package src.com.lcb.bridge_pattern;
/*
 * 
 * 模拟面条的种类
 * 
 * */
public class NoodleStyle2 extends AbstractNoodle {

	public NoodleStyle2(Peppery style) {
		
		super(style);
	}
	
	@Override
	public void eat() {
		
		System.out.println("这是一碗"+super.style.style()+"种类2的面条");

	}

}
