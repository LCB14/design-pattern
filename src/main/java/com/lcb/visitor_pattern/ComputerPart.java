package com.lcb.visitor_pattern;

/**
 * @author lichangbao
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);

}