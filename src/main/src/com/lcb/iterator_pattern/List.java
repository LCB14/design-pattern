package com.lcb.iterator_pattern;

//定义集合可以进行的操作
public interface List {

    public void add(Object obj);  
    public Object get(int index);
    public Iterator iterator();  
    public int getSize();
}