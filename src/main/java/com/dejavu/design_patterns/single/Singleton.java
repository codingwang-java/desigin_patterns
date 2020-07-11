package com.dejavu.design_patterns.single;

/**
 * Created by wzq
 *
 * @date: 2020/7/11 9:37
 * @description:
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton(){
        System.out.println("成功创建单例");
    }
    public static Singleton getSingleton(){
        return singleton;
    }
}
