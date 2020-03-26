package com.lcb.visitor_pattern;

public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {

        computerPartVisitor.visitMonitor(this);
    }
}