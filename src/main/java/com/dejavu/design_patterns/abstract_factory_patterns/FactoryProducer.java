package com.dejavu.design_patterns.abstract_factory_patterns;

/**
 * Created by wzq
 *
 * @date: 2020/7/12 2:06
 * @description:
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
