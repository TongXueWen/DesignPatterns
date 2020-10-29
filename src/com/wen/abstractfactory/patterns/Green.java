package com.wen.abstractfactory.patterns;

import com.wen.abstractfactory.patterns.interfaces.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
