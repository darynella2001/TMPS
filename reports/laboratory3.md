# Behavioral Design Patterns


## Author: Andronovici Darinela

----

## Objectives:

* Study and understand the Behavioral Design Patterns.
* Determine the additional functionalities of the system;
* Implement at least 1 BDPs for the specific domain;
* Keep the files grouped (into packages/directories) by their responsibilities

## Theory:

*Behavioral design patterns* are concerned with the interaction and responsibility of objects.

In these design patterns, the interaction between the objects should be in such a way that they can easily talk to each other and still should be loosely coupled.Some examples of this kind of design patterns are:
* ***Chain of Responsibility*** - Lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain;
* ***Command*** - Turns a request into a stand-alone object that contains all information about the request. This transformation lets you parameterize methods with different requests, delay or queue a request's execution, and support undoable operations;
* ***Iterator*** -  Lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.);
* ***Mediator*** - Lets you reduce chaotic dependencies between objects. The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object;
* ***Memento*** - Lets you save and restore the previous state of an object without revealing the details of its implementation;
* ***Observer*** - Lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they're observing;
* ***State*** -  Lets an object alter its behavior when its internal state changes. It appears as if the object changed its class;
* ***Strategy*** - Lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable;
* ***Template Method*** - Defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure;
* ***Visitor*** - Lets you separate algorithms from the objects on which they operate.

## Used Design Pattern:

* Strategy

## Implementation

* **Strategy**
The strategy that I used in my laboratory work is a discount system (i.e. the customer may have a *Discount Card*, which will make a discount
of 10%, but, in case he does not have one, I make a bigger discount in case if it is his *birthday*).

Firstly, for this design pattern, I have created an *interface* named ```Strategy```.

```java
public interface Strategy {
    double doDiscount (double price);
}

```
Then, I created the concrete classes ```DiscountCard```  and ```Birthday``` which implements the same interface.
```java
public class DiscountCard implements Strategy{
    @Override
    public double doDiscount(double price) {
//        do a -10% discount
        return price * 0.9;
    }
```
```java
public class Birthday implements Strategy {
    @Override
    public double doDiscount(double price) {
//        do -20% discount
        return price * 0.8;
    }
```

After this, a created ***Context*** Class, which will be used in ```Main.java``` to see change in behaviour
when it changes its ***Strategy***.
```java
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        
        this.strategy = strategy;
    }

    public double executeStrategy (double price){
        
        return strategy.doDiscount(price);
    }

}
```

## Output
Here you can see the output for different cases:
* Chocolate with custom packaging and DiscountCard

![image](https://user-images.githubusercontent.com/56044286/145309317-10f67341-58c4-4555-9184-3ddea4ecbd6c.png)

* Chocolate with NO custom packaging and no DiscountCard, but having the birthday
![image](https://user-images.githubusercontent.com/56044286/145309394-fddbf349-1698-4ab7-be2e-d2c4e8915491.png)

* Candies with NO custom packaging, with DiscountCard 

![image](https://user-images.githubusercontent.com/56044286/145309542-02252005-c2c2-4293-9e78-ec073b71a59b.png)

* Chocolate with NO custom packaging, NO DiscontCard, NO birthday (standard prices)
![image](https://user-images.githubusercontent.com/56044286/145309622-a7ccd886-d613-4b6b-8cfe-b30bc6c10d41.png)


## Conclusions
After studying all the theory and putting it into practice in this laboratory work, 
I straighten my knowledge about Design Patterns, and namely about BDPs. In short,
behavioral design patterns are design patterns that identify common communication patterns between objects and realize these patterns. 
By doing so, these patterns increase flexibility in carrying out this communication.
