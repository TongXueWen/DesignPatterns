package com.wen.proxy.pattern;

import com.wen.proxy.pattern.interfaces.Image;

public class ProxyImage implements Image {

    private Realmage realmage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realmage == null) {
            realmage = new Realmage(fileName);
        }
        realmage.display();
    }
}
