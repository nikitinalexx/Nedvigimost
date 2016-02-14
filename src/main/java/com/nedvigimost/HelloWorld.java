package com.nedvigimost;

/**
 * Created by Алексей on 07.02.2016.
 */
public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printHello() {
        System.out.println("Hello, " + name + '!');
    }
}
