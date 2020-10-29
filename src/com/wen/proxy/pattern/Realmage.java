package com.wen.proxy.pattern;

import com.wen.proxy.pattern.interfaces.Image;

public class Realmage implements Image {

    private String fileName;

    public Realmage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Display " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("loading " + fileName);
    }
}
