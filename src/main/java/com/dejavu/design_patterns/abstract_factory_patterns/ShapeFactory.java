package com.dejavu.design_patterns.abstract_factory_patterns;

/**
 * Created by wzq
 *
 * @date: 2020/7/12 1:58
 * @description:
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("benz"))return  new Benz();
        if(shape.equalsIgnoreCase("bmw"))return new BMW();
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
