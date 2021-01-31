package com.yash.observer.observable;

import com.yash.observer.observer.IObserver;
import java.util.*;

public abstract class AbstractObservable {
    Set<IObserver> observers = new HashSet<>();

    public void register(IObserver observer) {
        observers.add(observer);
        System.out.println("New observer registered");
    }

    public void unregister(IObserver observer) {
        observers.remove(observer);
        System.out.println("Old observer deleted");
    }

    public void notifyOthers(State state) {
        for(IObserver observer: observers) {
            observer.update(state);
        }
    }
}
