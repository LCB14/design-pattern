package com.lcb.visitor_pattern;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visitComputor(Computer computer) {

        System.out.println("Displaying Computer.");
    }

    @Override
    public void visitMouse(Mouse mouse) {

        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visitKeyboard(Keyboard keyboard) {

        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visitMonitor(Monitor monitor) {

        System.out.println("Displaying Monitor.");
    }
}