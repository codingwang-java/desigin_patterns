package com.dejavu.design_patterns.single;


/**
 * Created by wzq
 *
 * @date: 2020/7/11 9:57
 * @description:
 */
public class GetInstance {
    public static void main(String[] args) {
        //饿汉式
        Singleton.getSingleton();
        //懒汉式
        LazySingleton.getLazySingleton();
        //双重锁
        DoubleCheck.getSinggleton();
        //静态内部类
        InnerSingleton.getInstance();
        //枚举单例
        EnumSingleton.INSTANCE.getInstance();
    }
}
