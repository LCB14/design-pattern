package com.lcb.composite_pattern;

/**
 * 模拟text文件
 *
 * @author lichangbao
 */
public class TxtBaseFile extends BaseFile {

    public TxtBaseFile(String name) {
        this.name = name;
    }

    @Override
    public void showFileName() {
        System.out.println(this.name);
    }

}