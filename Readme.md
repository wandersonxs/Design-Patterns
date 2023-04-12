Design Pattern and SOLID Principles Learning

## Creational Design Patterns

#### 1 - Singleton Pattern - 13/03/2023
    When you want only one instance of an object.
    
    Using enum is the best solution for the creational pattern - Singleton
    Because Enum is compile time constants, it is going to be guaranteed that
    this instance is thread safe by default.

#### 2 - Factory - 20/03/2023
        Programming to super classes and creating a class responsible to instanciate objects.
        Don't expose the creation logic to the client and refer the created object using 
        standard interface.

#### 3 - Abstract Factory - 20/03/2023
        A factory of factories.
        Abstract factory pattern creates indenpendent factories essentially, so it is producing
        families of related objects.

#### 4 - Builder Factory - 08/04/2023
        Avoid a lot of constructors and telescoping constructors;
        Immutable attributes / objects to parallel execution;

## Behavioral Design Patterns

#### 1 - Strategy Pattern - 14/03/2023

    Strategy pattern is a behavioral pattern and it favor composition over inheritance.
    Inharitance IS AS relationship; Every class can extend a single class in Java;
    Composition HAS A relationship; Every class can have several instance encapsulated variable;
    Composition gives more flexibility;
    With composition you can change behavior at run time;


#### 2 - Command Pattern - 22/03/2023
    The aim is to achieve separation of concerns;
    Because of the abstract layer, we can achieve loosely coupled design;
    Cand change send's behavior at run-time;
    
    There are usually 4 components of command pattern;
        - Client
        - Invoker
        - Command
        - Receiver

    Advantages:
        Decouple classes that will invoke the operations and the classes that will execute the operation.
            LOOSELY COUPLED DESIGN + SINGLE RESPONSABILITY

        Add further commands without modifying existing code
            OPEN / CLOSED PRINCIPLE
    
    The main advantage of storing the command (request) in an object is that we can execute them
    whenever we want - This is how we can achieve undo and redo operations.

#### 3 - Iterator Pattern - 09/04/2023

    We can access elements of a collection for example in sequential manner ithout any need to know about 
    the underlying representation;
    Essentially it is useful when we eant to iterate through elements with different types;
    The iterator pattern decouples the algorithms from the containers wihtout the need for the underlying 
    representation.
    We do not care how the data is being stored. We just want to iterate through the items independently 
    of the underlying representation;
    Java uses Iterator pattern under the hood.

## Structural Design Patterns

    In software engineering structural design patterns are about how classes and objects can be composed to 
    form larger structures. The structural design patterns simplifies the structure of software components 
    by identifying the relationship between them.

####  1 - Decorator Pattern 15/03/2023

    Decorator is powerful because you can add features dynamically chaining them.
    Ex.: Ride ride = new Chocolate(new Music(new Movie(new Chocolate(new PlainRide()))));

####  2 - Façade Pattern 21/03/2023

    The façade pattern can provide a relatively easy to understand interface to a rather complex system.
    Façade pattern provides a simple interface to a complicated framework or system;
    It only provides the features that client needs.

    Motivation to use Façade Pattern is when you deal with complicated library or framework;
    Extremely useful when dealing with API's;
    When we need to initialize frameworks, libraries, etc...
    The problem is that our classes may become tightly coupled to the implementation of the framework,
    then the façade pattern can help us to isolate the framework.

####  3 - Flyweight Pattern 08/04/2023

    A flyweight is an object that minimizes memory usage by sharing as much data as possible
    with other simular objects;
    Flyweight design pattern can be applied to reduce the load on memory by sharing objects;
    We use it to minimize memory usage;
    What is the flyweight exactly? Objects storing the intrinsict state
    We will store extrinsic states into a a data structure; usually a simple one-dimensional
    array data structure;

#### 4 - Adapter Pattern 12/04/2023
    The aim of adapter pattern is to allow objects with incompatible interfaces 
    to collaborate and work together.


## Notes about Algorithms:
     If most of the items are in their sorted position and there are few items that we have to handle; 
     Then Buble Sort is recommended.
     If we want to sort reference types and objects, then merge sort is recommended. Java uses merge sort under the hood.
     If we want to use primitive types, then quicksort is the best algorithm possible.