package com.yash.observer.client;

import com.yash.observer.observable.ConcreteObservable;
import com.yash.observer.observer.IObserver;

public class Main {
    public static void main(String[] args) {
        IObserver observer = state -> System.out.println("I have observed a change in state!");
        ConcreteObservable observable = new ConcreteObservable();
        observable.register(observer);
        observable.compute();
        observable.unregister(observer);
    }
}
