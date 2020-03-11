package src.com.lcb.composite_pattern;
/*
 * 
 * 组合模式
 * 特点：使得用户对单个对象和组合对象的使用具有一致性。
 * 
 * */
public class CompositePattern {

	public static void main(String[] args) {
		
		Folder folder = new Folder("一级目录");
	    File txtFile = new TXTFile("二级文件txt");
	    File aviFile = new AVIFile("二级文件avi");
	    Folder txtFolder = new Folder("二级txt目录");
	    Folder aviFolder = new Folder("二级avi目录");

	    File txtFile1 = new TXTFile("三级文件txt1");
	    File txtFile2 = new TXTFile("三级文件txt2");
	    File txtFile3 = new TXTFile("三级文件txt3");
	    File aviFile1 = new AVIFile("三级文件avi1");
	    File aviFile2 = new AVIFile("三级文件avi2");
	    
	    folder.addFile(txtFile);
	    folder.addFile(aviFile);
	    folder.addFile(txtFolder);
	    folder.addFile(aviFolder);
	    
	    txtFolder.addFile(txtFile1);
	    txtFolder.addFile(txtFile2);
	    txtFolder.addFile(txtFile3);
	    
	    aviFolder.addFile(aviFile1);
	    aviFolder.addFile(aviFile2);
	    
	    System.out.println("一级目录下的文件:");
	    folder.displayFiles();
	    System.out.println("\n二级txt目录下的文件:");
	    txtFolder.displayFiles();
	    System.out.println("\n二级avi目录目录下的文件:");
	    aviFolder.displayFiles();
	}

}
