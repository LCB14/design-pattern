package com.lcb.chain_of_responsibility_pattern;

/**
 * 总经理
 *
 * @author lichangbao
 */
public class GeneralManger extends AbstractLeader {

    private final String name = "总经理";
    private final int level = 0;//最大

    @Override
    public void handler(Files file) {

        if (this.level > file.getLevel()) {
            System.out.println(name + "未处理文件《" + file.getFileName() + "》");
            getNextLeader().handler(file);
        } else {
            System.out.println(name + "处理了文件《" + file.getFileName() + "》");
        }
    }
}
