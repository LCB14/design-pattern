package src.com.lcb.com.lcb.adapter_pattern_imp;
//接口适配器（可以很好的满足接口隔离原则）
public class AdapterPattern {

	public static void main(String[] args) {
		
		System.out.println("===============接口适配器==============");
		
		Sourceable source1 = new SourceSub1();  
        Sourceable source2 = new SourceSub2();  
          
        source1.method1();  
        source1.method2();  
        source2.method1();  
        source2.method2();  

	}

}
