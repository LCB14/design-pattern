package com.lcb.composite_pattern;

/**
 * 组合模式
 * 特点：使得用户对单个对象和组合对象的使用具有一致性。
 * 应用场景：Spring MVC 的解析器实现
 *
 * @author lichangbao
 */
public class CompositePattern {

    public static void main(String[] args) {

        Folder folder = new Folder("一级目录");

        Folder txtFolder = new Folder("二级txt目录");
        Folder aviFolder = new Folder("二级avi目录");

        BaseFile txtFile = new TxtBaseFile("二级文件txt");
        BaseFile aviFile = new AviBaseFile("二级文件avi");

        BaseFile txtFile1 = new TxtBaseFile("三级文件txt1");
        BaseFile txtFile2 = new TxtBaseFile("三级文件txt2");
        BaseFile txtFile3 = new TxtBaseFile("三级文件txt3");

        BaseFile aviFile1 = new AviBaseFile("三级文件avi1");
        BaseFile aviFile2 = new AviBaseFile("三级文件avi2");

        folder.addFile(aviFolder);
        folder.addFile(txtFolder);
        folder.addFile(aviFile);
        folder.addFile(txtFile);

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
