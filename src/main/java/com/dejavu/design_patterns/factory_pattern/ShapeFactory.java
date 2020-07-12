package com.dejavu.design_patterns.factory_pattern;

/**
 * Created by wzq
 *
 * @date: 2020/7/11 22:47
 * @description:
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType==null)return null;
        if(shapeType.equalsIgnoreCase("bmw"))return new BMW();
        if(shapeType.equalsIgnoreCase("benz"))return new Benz();
        return null;
    }
}
