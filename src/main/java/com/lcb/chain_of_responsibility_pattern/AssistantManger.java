package com.lcb.chain_of_responsibility_pattern;

/**
 * 副经理
 *
 * @author lichangbao
 */
public class AssistantManger extends AbstractLeader {

    private final String name = "副经理";

    private final int level = 1;

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