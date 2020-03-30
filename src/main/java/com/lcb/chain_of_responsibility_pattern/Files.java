package com.lcb.chain_of_responsibility_pattern;

/**
 * @author lichangbao
 */
public class Files {

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 保密级别
     */
    private int level;

    public String getFileName() {

        return fileName;
    }

    public void setFileName(String fileName) {

        this.fileName = fileName;
    }

    public int getLevel() {

        return level;
    }

    public void setLevel(int level) {

        this.level = level;
    }
}