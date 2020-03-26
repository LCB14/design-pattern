package com.lcb.visitor_pattern;

public interface ComputerPartVisitor {

    void visitComputor(Computer computer);

    void visitMouse(Mouse mouse);

    void visitKeyboard(Keyboard keyboard);

    void visitMonitor(Monitor monitor);
}