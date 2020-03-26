package com.lcb.visitor_pattern;

public class Mouse implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {

        computerPartVisitor.visitMouse(this);
    }
}