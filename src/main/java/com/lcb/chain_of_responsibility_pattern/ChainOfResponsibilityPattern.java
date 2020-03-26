package com.lcb.chain_of_responsibility_pattern;

/**
 * 责任链模式（职责链模式）
 * 特点：使多个对象都有机会处理请求。
 */
public class ChainOfResponsibilityPattern {

    public static void main(String[] args) {

        //定义职责链
        Lingdao zongjingli = new Zongjingli();
        Lingdao fujingli = new Fujingli();
        Lingdao bumenjingli = new Bumenjingli();
        bumenjingli.setNextLingdao(fujingli);
        fujingli.setNextLingdao(zongjingli);

        //定义两份文件
        Files f1 = new Files();
        f1.setFileName("正确对待旱鸭子");
        f1.setLevel(1);
        Files f2 = new Files();
        f2.setFileName("年会在那里举行");
        f2.setLevel(0);

        //提交文件
        bumenjingli.chuli(f1);
        bumenjingli.chuli(f2);
    }

}
