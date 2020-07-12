package com.dejavu.design_patterns.factory_pattern;

/**
 * Created by wzq
 *
 * @date: 2020/7/11 22:50
 * @description:
 */
public class FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("bmw");
        shape.draw();
    }
}
