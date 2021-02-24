package com.yash.singleton;

public class Client {
    public static void main(String[] args) {
        //First instantiation
        Singleton sg1 = Singleton.getInstance("Hello@123");
        System.out.println(sg1);

        // Second instantiation
        Singleton sg2 = Singleton.getInstance("Delta@789");
        System.out.println(sg2);
    }
}
