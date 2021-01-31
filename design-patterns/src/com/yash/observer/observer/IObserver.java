package com.yash.observer.observer;

import com.yash.observer.observable.State;

@FunctionalInterface
public interface IObserver {
    void update(State state);
}
