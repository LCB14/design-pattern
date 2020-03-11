package src.com.lcb.proxy_pattern;
/*
 * 
 * 代理模式
 * 特点：就是对获取目标对象的过程进行了封装而已。
 * 
 * */
public class ProxyPattern {
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		Image image = new ProxyObject(null);
		
		System.out.println("系统创建一个代理Image对象的开销："+(System.currentTimeMillis()-start));
		
		//由于使用代理模式，此处调用才是创建真正的Image对象的所在。
		image.showImage();
		
		System.out.println("真正创建一个Image对象的时间开销："+(System.currentTimeMillis()-start));
	}
}
