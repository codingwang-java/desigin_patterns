package com.dejavu.design_patterns.abstract_factory_patterns;

/**
 * Created by wzq
 *
 * @date: 2020/7/12 1:54
 * @description:
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("red");
    }
}
