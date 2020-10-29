package com.wen.abstractfactory.patterns;

import com.wen.abstractfactory.patterns.interfaces.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
