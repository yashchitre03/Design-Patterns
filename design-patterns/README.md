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