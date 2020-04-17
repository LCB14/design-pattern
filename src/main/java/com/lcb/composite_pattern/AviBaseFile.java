package com.lcb.composite_pattern;

/**
 * 模拟avi文件
 *
 * @author lichangbao
 */
public class AviBaseFile extends BaseFile {

    public AviBaseFile(String name) {
        this.name = name;
    }

    @Override
    public void showFileName() {
        System.out.println(this.name);
    }
}