package com.lcb.visitor_pattern;

public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {

        computerPartVisitor.visitKeyboard(this);
    }

}