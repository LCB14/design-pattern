package com.lcb.composite_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟文件夹
 *
 * @author lichangbao
 */
public class Folder extends BaseFile {

    private List<BaseFile> fileList = new ArrayList<BaseFile>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void showFileName() {
        System.out.println(this.name);
    }

    public void addFile(BaseFile file) {
        fileList.add(file);
    }

    /**
     * 打印文件夹下的文件名
     */
    public void displayFiles() {
        for (BaseFile file : this.fileList) {
            file.showFileName();
        }
    }
}