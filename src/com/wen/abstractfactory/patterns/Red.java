package com.wen.abstractfactory.patterns;

import com.wen.abstractfactory.patterns.interfaces.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
