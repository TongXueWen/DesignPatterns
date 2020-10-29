package com.wen.abstractfactory.patterns;

import com.wen.abstractfactory.patterns.interfaces.Shape;

/**
 * 创建实现接口的实体类
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
