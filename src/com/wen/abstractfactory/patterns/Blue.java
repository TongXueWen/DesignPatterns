package com.wen.abstractfactory.patterns;

import com.wen.abstractfactory.patterns.interfaces.Color;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
