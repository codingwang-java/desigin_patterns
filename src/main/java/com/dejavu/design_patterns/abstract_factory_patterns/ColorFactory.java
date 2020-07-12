package com.dejavu.design_patterns.abstract_factory_patterns;

/**
 * Created by wzq
 *
 * @date: 2020/7/12 2:05
 * @description:
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color.equalsIgnoreCase("blue"))return  new Blue();
        if(color.equalsIgnoreCase("red"))return  new Red();
        return null;
    }
}
