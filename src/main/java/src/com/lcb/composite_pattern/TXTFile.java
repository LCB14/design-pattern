package src.com.lcb.composite_pattern;
/**
 * 
 * 模拟text文件
 * 
 * */
public class TXTFile extends File{

    public TXTFile(String name) {
    	
        this.name = name;
    }
    
    @Override
    public void showFileName() {
    	
        System.out.println(this.name);
        
    }

}