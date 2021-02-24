package com.yash.singleton;

public class Singleton {
    private static Singleton obj;
    private String name;

    private Singleton(String name) {
        this.name = name;
    }

    public static Singleton getInstance(String name) {
        if (obj == null) obj = new Singleton(name);
        return obj;
    }

    @Override
    public String toString() {
        return name;
    }
}
