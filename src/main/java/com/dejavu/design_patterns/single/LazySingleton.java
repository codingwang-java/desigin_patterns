package com.dejavu.design_patterns.single;

/**
 * Created by wzq
 *
 * @date: 2020/7/11 11:04
 * @description:
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;
    private LazySingleton(){
        System.out.println("懒汉式");
    }
    public static LazySingleton getLazySingleton() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
