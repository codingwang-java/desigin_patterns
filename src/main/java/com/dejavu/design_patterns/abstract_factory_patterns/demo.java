package com.dejavu.design_patterns.abstract_factory_patterns;

/**
 * Created by wzq
 *
 * @date: 2020/7/12 2:06
 * @description:
 */
public class demo {
    public static void main(String[] args) {
        AbstractFactory factory=FactoryProducer.getFactory("shape");
        factory.getShape("bmw").draw();
        AbstractFactory factory1=FactoryProducer.getFactory("color");
        factory1.getColor("red").fill();
    }
}
