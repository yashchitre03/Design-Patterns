package com.yash.observer.observable;

public class ConcreteObservable extends AbstractObservable {
    State state = new State();

    public void compute() {
        notifyOthers(state);
    }
}
