# Design Patterns
> Contains code for various design patterns seen in software engineering.
> These implementations are for
> learning the design patterns and contain simple examples.

## Strategy pattern
* It is a behavioral pattern that enables us to create objects with
different strategies. 
* The strategies are decided by the client at run-time
using dependency injection.
* It gets rid of complex hierarchical inheritance and uses composition 
to resolve the algorithms/strategies for the object.
  
## Observer pattern
* It is a behavioral pattern that establishes a one-to-many relationship
between the observable and the observers.
* It allows the observer to get any updates in the state of the observable/subject 
without having to continuously poll from the subject.
* This is done by passing the observer itself to the subject.
* The subject can then call observers' methods when a change in state happens.

## Decorator (aka Wrapper) pattern
* It is a structural design pattern used to add new functionality to an object.
* It takes an exiting object and wraps the object with new features.
* The returned object by the wrapper is of the same type as the original object.
* It is useful to avoid the class explosion problem.

## Factory method pattern
* It is a creational pattern used to create objects of different classes.
* It defines an interface and lets the subclasses decide which class to instantiate.
* The client doesn't have to worry about which class to instantiate and hence,
promotes loose coupling.