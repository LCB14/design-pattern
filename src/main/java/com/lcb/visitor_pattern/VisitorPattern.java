package com.lcb.visitor_pattern;

/**
 * 访问者模式
 * 应用场景：org.springframework.web.servlet.DispatcherServlet#initStrategies
 */
public class VisitorPattern {

    public static void main(String[] args) {

        ComputerPart computer = new Computer();

        computer.accept(new ComputerPartDisplayVisitor());
    }

}
