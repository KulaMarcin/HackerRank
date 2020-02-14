package com.kulamarcin;

class Singleton{
    public static final Singleton INSTANCE = new Singleton();
    public String str;

    private Singleton() {
    }

    static Singleton getSingletonInstance(){
        return INSTANCE;
    }
}

public class JavaSingletonPattern {
    public static void main(String [] args) {
        Singleton a = Singleton.getSingletonInstance();
    }
}
