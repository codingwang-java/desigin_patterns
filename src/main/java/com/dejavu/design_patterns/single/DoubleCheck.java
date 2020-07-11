package com.dejavu.design_patterns.single;


/**
 * Created by wzq
 *
 * @date: 2020/7/11 11:33
 * @description:
 */
public class DoubleCheck  {
    private static volatile DoubleCheck doubleCheck;
    /*实例化对象的那行代码（标记为error的那行），实际上可以分解成以下三个步骤：
    分配内存空间 初始化对象将对象指向刚分配的内存空间
    但是有些编译器为了性能的原因，可能会将第二步和第三步进行重排序，顺序就成了：
    分配内存空间 将对象指向刚分配的内存空间初始化对象 多线程情况下会出现有线程访问一个初始化未完成的对        象*/
    private DoubleCheck(){
        System.out.println("doublecheck");
    }
    public static DoubleCheck getSinggleton(){
        if(doubleCheck==null){
            synchronized (DoubleCheck.class){
                if(doubleCheck==null){
                    doubleCheck = new DoubleCheck();
                }
            }
        }
        return doubleCheck;
    }
}
