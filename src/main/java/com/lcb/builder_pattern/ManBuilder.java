package com.lcb.builder_pattern;

/**
 * 模拟建造一个男性角色
 */
public class ManBuilder implements PersonBuilder {


    public void buildBody() {

        System.out.println("建造身体部分");

    }

    public void buildFoot() {

        System.out.println("建造四肢部分");

    }

    public void buildHead() {

        System.out.println("建造头部部分");

    }

}  