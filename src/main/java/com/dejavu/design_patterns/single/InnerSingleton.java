package com.dejavu.design_patterns.single;

/**
 * Created by wzq
 *
 * @date: 2020/7/11 12:17
 * @description:
 */
public class InnerSingleton {

    private static class SingletonClassHolder{
        private static final InnerSingleton INNER_SINGLETON= new InnerSingleton();
    }
    private InnerSingleton(){
        System.out.println("静态内部类");
    }
    public static final InnerSingleton getInstance(){
        return SingletonClassHolder.INNER_SINGLETON;
    }
}
