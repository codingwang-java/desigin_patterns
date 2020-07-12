package com.dejavu.design_patterns.abstract_factory_patterns;

/**
 * Created by wzq
 *
 * @date: 2020/7/12 1:55
 * @description:
 */
public abstract class AbstractFactory {
    public abstract Shape getShape(String shape);
    public abstract Color getColor(String color);
}
