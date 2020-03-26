package com.lcb.proxy_pattern;

/**
 * 代理模式（静态代理）
 * 优点：1、避免客户端程序直接访问目标对象，降低给系统带来的复杂性。2、可以通过代理对象也对目标对象原有的业务进行增强。
 * 缺点：不容易拓展，违背开闭原则。
 * 方案：动态代理
 */
public class ProxyPattern {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        Image image = new ProxyObject(null);

        System.out.println("系统创建一个代理Image对象的开销：" + (System.currentTimeMillis() - start));

        //由于使用代理模式，此处调用才是创建真正的Image对象的所在。
        image.showImage();

        System.out.println("真正创建一个Image对象的时间开销：" + (System.currentTimeMillis() - start));
    }
}
