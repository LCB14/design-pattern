package com.lcb.composite_pattern;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * 模拟文件夹
 * 
 * */
public class Folder extends File{
    
    private List<File> fileList = new ArrayList<File>();
    
    public Folder(String name) {
    	
        this.name = name;
    }
    
    @Override
    public void showFileName() {
    	
        System.out.println(this.name);
    }

    public void addFile(File file){
    	
        fileList.add(file);
    }
    
    //打印文件夹下的文件名
    public void displayFiles(){
    	
        for(File file : this.fileList){
        	
            file.showFileName();
        }
    }
}