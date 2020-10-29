package com.wen.proxy.pattern;

import com.wen.proxy.pattern.interfaces.Image;

/**
 * 当被请求时，使用 ProxyImage 来获取 RealImage 类的对象。
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.png");

        image.display();
        System.out.println("");
        image.display();

    }
}
