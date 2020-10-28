package com.wen.proxy.pattern;

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
