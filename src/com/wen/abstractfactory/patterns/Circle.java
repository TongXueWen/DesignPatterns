package com.wen.abstractfactory.patterns;

import com.wen.abstractfactory.patterns.interfaces.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
