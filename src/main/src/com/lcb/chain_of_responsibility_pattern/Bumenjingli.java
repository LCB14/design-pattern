package com.lcb.chain_of_responsibility_pattern;
/**
 * 部门经理
 */
public class Bumenjingli extends Lingdao{
	
    private final String name = "部门经理";
    private final int level = 2;
    
    @Override
    public void chuli(Files file) {
    	
        if(this.level > file.getLevel()){
            System.out.println(name + "未处理文件《" + file.getFileName() + "》");
            getNextLingdao().chuli(file);
        }else{
            System.out.println(name + "处理了文件《" + file.getFileName() + "》");
        }
    }
}