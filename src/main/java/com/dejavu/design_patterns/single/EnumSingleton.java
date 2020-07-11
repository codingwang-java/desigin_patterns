package com.dejavu.design_patterns.single;

/**
 * Created by wzq
 *
 * @date: 2020/7/11 12:22
 * @description:
 */
public enum EnumSingleton {
    INSTANCE;
    public void getInstance(){
        System.out.println("枚举单例");
    }
}
