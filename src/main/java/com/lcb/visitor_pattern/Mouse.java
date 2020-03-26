package com.lcb.visitor_pattern;

/**
 * @author lichangbao
 */
public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {

        computerPartVisitor.visitMouse(this);
    }
}