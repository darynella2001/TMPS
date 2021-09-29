# Topic: *Creational Design Patterns*
## Author: *Andronovici Darinela*
------
## Table of Contents
* [Objectives](#objectives)
* [Theory](#theory)
* [Main Tasks](#main-tasks)
* [Implementation and Explanation](#implementation)
* [Results](#results)
* [Conclusions](#conclusions)
------
## Objectives:
__1. Study and understand the Creational Design Patterns.__

__2. Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms.__

__3. Use some creational design patterns for object instantiation in a sample project.__

## Theory:
In software engineering, the creational design patterns are the general solutions that deal with object creation, trying to create objects in a manner suitable to the situation. The basic form of object creation could result in design problems or added complexity to the design. Creational design patterns solve this problem by optimizing, hiding or controlling the object creation.
They provide various object creation mechanisms, which increase flexibility and reuse of existing code.

Some examples of this kind of design patterns are:

   * Singleton - ensures that a class has only one instance, while providing a global access point to its instance;
   * Builder - constructs complex objects step by step; also it allows to produce different objects using the same code;
   * Prototype - makes copies of existing objects without making the code dependent on their classes;
   * Object Pooling - is used in situations where the cost of initializing a class instance is very high;
   * Factory Method -  provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created;
   * Abstract Factory - produces families of related objects without specifying their concrete classes.
   
## Main Tasks:
__1. Choose an OO programming language and a suitable IDE or Editor (No frameworks/libs/engines allowed).__

__2. Select a domain area for the sample project.__

__3. Define the main involved classes and think about what instantiation mechanisms are needed.__

__4. Based on the previous point, implement at least 3 creational design patterns in your project.__

## Implementation and Explanation
In this laboratory work, we have a shop of sweets, where the products are devided into two categories : chocolates and candies. 
Therefore, each category has a factory method implemented **ChocolateFactory** and **CandyFactory**, which are used to generate objects of concrete classes. 
The **Chocolate Factory** and **Candy Factory** implement the interface **Abstract Factory** which has the method *sellSweet()*.
Each factory has three subclasses with their separate implemented builders. 
This was done in order to enable the user to create different representations from the same construction process.
In each two concrete factories, there is a static creation method that acts like a constructor.
This method calls the private constructor to create an object and saves it in a static field. 
All following calls to this method return the cached object.
* Abstract Factory
```java
public interface AbstractFactory {
    Sweet sellSweet(String name);
}
```
* Factory Method
**Candy Factory**
```java
public class CandyFactory implements AbstractFactory {
    private static CandyFactory candyFactory;
    private final Confectioner confectioner = new Confectioner();

    public static CandyFactory getCandyFactory(){
        if (candyFactory == null)
            candyFactory = new CandyFactory();
        return candyFactory;
    }

    private CandyFactory(){}

    public Sweet sellSweet(String name) {
        if (name == null) {
            return null;
        }
        if (name.toLowerCase() == "lollipop") {
            LollipopBuilder lollipopBuilder = new LollipopBuilder();
            confectioner.sellLollipop(lollipopBuilder);
            return lollipopBuilder.getSweet();

        } else if (name.toLowerCase() == "goldenbears") {
            GoldBearsBuilder goldbearsBuilder = new GoldBearsBuilder();
            confectioner.sellGoldBears(goldbearsBuilder);
            return goldbearsBuilder.getSweet();

        } else if (name.toLowerCase() == "candy") {
            CandyBuilder candyBuilder = new CandyBuilder();
            confectioner.sellCandy(candyBuilder);
            return candyBuilder.getSweet();
        }
        return null;
    }
}
```
**Chocolate Factory**
```java
public class ChocolateFactory implements AbstractFactory {
    private static ChocolateFactory chocolateFactory;
    private final Confectioner confectioner = new Confectioner();

    public static ChocolateFactory getChocolateFactory(){
        if (chocolateFactory == null)
            chocolateFactory = new ChocolateFactory();
        return chocolateFactory;
    }

    private ChocolateFactory(){}

    public Sweet sellSweet(String name) {
        if (name == null) {
            return null;
        }
        if (name.toLowerCase() == "white chocolate") {
            WhiteChocolateBuilder whiteChocolateBuilder = new WhiteChocolateBuilder();
            confectioner.sellWhiteChocolate(whiteChocolateBuilder);
            return whiteChocolateBuilder.getSweet();
        } else if (name.toLowerCase() == "milk chocolate") {
            MilkChocolateBuilder milkChocolateBuilder = new MilkChocolateBuilder();
            confectioner.sellMilkChocolate(milkChocolateBuilder);
            return milkChocolateBuilder.getSweet();
        } else if (name.toLowerCase() == "dark chocolate") {
            DarkChocolateBuilder darkChocolateBuilder = new DarkChocolateBuilder();
            confectioner.sellDarkChocolate(darkChocolateBuilder);
            return darkChocolateBuilder.getSweet();
        }
        return null;
    }
}
```
* Singleton
```java
public class CandyFactory implements AbstractFactory {
...
    public static CandyFactory getCandyFactory(){
        if (candyFactory == null)
            candyFactory = new CandyFactory();
        return candyFactory;
    }

    private CandyFactory(){}
```

* Builder
```java
public interface SweetBuilder {
    void create();
    void setName(String name);
    void setCompany(String company);
    void setSugar(int sugar);
    void setPrice(double price);
}
```

And the concrete builder of *Dark Chocolate*:
```java
public class DarkChocolateBuilder implements SweetBuilder {

    private DarkChocolate darkChocolate;

    public DarkChocolateBuilder(){
        this.create();
    }

    public void create(){
        this.darkChocolate = new DarkChocolate();
    }

    @Override
    public void setName(String name) {
        this.darkChocolate.setName(name);
    }

    @Override
    public void setCompany(String company) {
        this.darkChocolate.setCompany(company);
    }

    public void setSugar(int sugar){
        this.darkChocolate.setSugar(sugar);
    }

    @Override
    public void setPrice(double price) {
        this.darkChocolate.setPrice(price);
    }

    public DarkChocolate getSweet(){
        DarkChocolate sweet = this.darkChocolate;
        this.create();
        return sweet;
    }
}
```

## Results
Run the Main class and the terminal will ask you what to choose: chocolate or candies or in case you want to exit you have to type X.
After you type **chocolate** or **candies** you get the following output:

```java
Welcome to our SweetShop!
What you would like to buy: chocolate or candies? 
If you want to exit press X 
chocolate

The 'White & Hazelnuts' produced by Heidi
Description: The white sensation: whole caramelized hazelnut, on top of delicious white chocolate!
Sugar per 100g: 43g
Price: 43.2 MDL

The 'Alpine Milk Chocolate' produced by Schogetten
Description: Piece by piece delicious alpine milk chocolate!
Sugar per 100g: 55g
Price: 20.45 MDL

The 'Excellence ECUADOR 75%' produced by Lindt
Description: Immerse your senses in a symphony of flavour with deeper cocoa notes.
Sugar per 100g: 23g
Price: 32.5 MDL

Process finished with exit code 0
```

```java
Welcome to our SweetShop!
What you would like to buy: chocolate or candies? 
If you want to exit press X 
candies

The 'Strawberry Lollipop' produced by Chupa Chups
Slogan: Es redondo y dura mucho, Chupa Chups (en:It's round and long-lasting!)
Sugar per 100g: 82g
Price: 5.0 MDL

The 'Goldbears' produced by HARIBO
Slogan: Haribo macht Kinder froh – und Erwachsene ebenso (en: Haribo makes children happy – and adults as well)
Sugar per 100g: 46g
Price: 16.25 MDL

The 'Fruits Skittles Bag' produced by Chupa Chups
Slogan: Taste the Rainbow
Sugar per 100g: 90g
Price: 54.95 MDL

Process finished with exit code 0
```

## Conclusins
The main goal of this laboratory work was to familiarize ourselves with *Creational Design Patterns* and put it in practice. 
Generally speaking, Design Patterns are very important, because they help programmers to have a clean and understandable code.
Creational Design Patterns help to separate a system from how its objects are created, composed, and represented. 
