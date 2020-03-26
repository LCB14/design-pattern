package com.lcb.visitor_pattern;

/**
 * 访问者模式
 *
 * @author lichangbao
 */
public class VisitorPattern {

    public static void main(String[] args) {

        ComputerPart computer = new Computer();

        computer.accept(new ComputerPartDisplayVisitor());
    }

}
