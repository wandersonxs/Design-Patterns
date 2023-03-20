Design Pattern and SOLID Principles Learning

## Creational Design Patterns

#### 1 - Singleton Pattern - 13/03/2023
    When you want only one instance of an object.
    
    Using enum is the best solution for the creational pattern - Singleton
    Because Enum is compile time constants, it is going to be guaranteed that
    this instance is thread safe by default.

#### 2 - Factory - 20/03/2023
        Programming to super classes and creating a class responsible to instanciate objects.
        
#### 3 - Abstract Factory - 20/03/2023
        A factory of factories.

## Behavioral Design Patterns

#### 1 - Strategy Pattern - 14/03/2023

    Strategy pattern is a behavioral pattern and it favor composition over inheritance.
    Inharitance IS AS relationship; Every class can extend a single class in Java;
    Composition HAS A relationship; Every class can have several instance encapsulated variable;
    Composition gives more flexibility;
    With composition you can change behavior at run time;

## Structural Design Patterns

    In software engineering structural design patterns are about how classes and objects can be composed to 
    form larger structures. The structural design patterns simplifies the structure of software components 
    by identifying the relationship between them.

####  1 - Decorator Pattern 15/03/2023

    Decorator is powerful because you can add features dynamically chaining them.
    Ex.: Ride ride = new Chocolate(new Music(new Movie(new Chocolate(new PlainRide()))));



    