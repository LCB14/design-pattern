package com.lcb.singleton_pattern;

/**
 * 单例模式
 * 特点：对象只会被实例化一次
 **/
public class SingletonPattern {

    public static void main(String[] args) {

        Singleton sp1 = Singleton.getInstance();
        Singleton sp2 = Singleton.getInstance();

        System.out.println(sp1 == sp2);
    }

}

/**
 * 单例模式--懒汉式
 */
class Singleton {

    /**
     * 2.声明存放目标实例的（静态）变量
     */
    public static Singleton instance;

    /**
     * 1.将构造函数（private）
     */
    private Singleton() {
    }

    /**
     * 3.设置获取目标实例的（静态）方法
     */
    public static Singleton getInstance() {

        if (instance == null) {

            instance = new Singleton();
        }

        return instance;
    }
}