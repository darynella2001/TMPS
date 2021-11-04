# Structural Design Patterns


## Author: Andronovici Darinela

----

## Objectives:

* Study and understand the Structural Design Patterns.
* Determine the additional functionalities of the system;
* Implement at least 3 SDPs for the specific domain;
* Keep the files grouped (into packages/directories) by their responsibilities

## Theory:

In software engineering, the *structural patterns* explain how to assemble objects and classes into larger structures while keeping these structures flexible and efficient.
Some examples of this kind of design patterns are:
* ***Adapter*** - Allows objects with incompatible interfaces to collaborate;
* ***Bridge*** - Lets you split a large class, or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other;
* ***Composite*** - Lets you compose objects into tree structures and then work with these structures as if they were individual objects;
* ***Decorator*** - Lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors;
* ***Facade*** - Wraps a complex sub-system with a simple abstraction.
* ***Proxy*** - Lets you provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object;
* ***Flyweight*** - Lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all the data in each object.

## Used Design Patterns:

* Decorator 
* Composite
* Adapter


## Implementation

* **Decorator**

Allowed me to add new functionality to an existing object without altering its structure. Starting from the definition, which labels it as a 'wrapper', 
in the system, it was used as a wrapper for sweets (i.e. Custom Package).
Firstly, for this design pattern, I have created an *abstract* decorator class named ```SweetDecorator``` that implements the ```ISweet``` interface.

```java
public abstract class SweetDecorator implements ISweet{

    private ISweet sweet;

    public SweetDecorator(ISweet sweet){
        this.sweet = sweet;
    }
    @Override
    public String getDetails(){
        return sweet.getDetails();
    }

    @Override
    public void setName(String name) {
        sweet.setName(name);
    }

    @Override
    public void setCompany(String company){
        sweet.setCompany(company);
    }

    @Override
    public void setSugar(int sugar) {
        sweet.setSugar(sugar);
    }

    @Override
    public void setPrice(double price) {
        sweet.setPrice(price);
    }

    @Override
    public String getName(){
        return sweet.getName();
    }

    @Override
    public String getCompany(){
        return sweet.getCompany();
    }

    @Override
    public int getSugar(){
        return sweet.getSugar();
    }

    @Override
    public double getPrice(){
        return sweet.getPrice();
    }

}

```
Then, I created the concrete decorator class ```CustomPackage``` extends the ```SweetDecorator``` which allows me to make the price greater for the client, in a dynamic way.

```java
public class CustomPackaging extends SweetDecorator{
 
    public CustomPackaging(ISweet sweet){
        super(sweet);
    }

    public String getDetails(){
        return super.getDetails();
    }
    private String setCustomPackaging(){
        return ("\nYou have chosen a custom packaging for your sweet");
    }

    public void setName(String name) {
        super.setName(name);
    }

    public void setCompany(String company){
        super.setCompany(company);
    }

    public void setSugar(int sugar) {
        super.setSugar(sugar);
    }

    public void setPrice(double price) {
        super.setPrice(price);
    }
    public String getName(){
        return super.getName();
    }

    @Override
    public String getCompany(){
        return super.getCompany();
    }

    @Override
    public int getSugar(){
        return super.getSugar();
    }

    @Override
    public double getPrice(){
        return super.getPrice() + 10;
    }

    @Override
    public String toString() {
        return "\nThe '" + getName() + "' produced by " + getCompany() + "\n" + getDetails()  + setCustomPackaging() + "\nSugar per 100g: " + getSugar() + "g" + "\nPrice: "+ getPrice() + " MDL\n";
    }
}


```

* **Composite**
This pattern creates a class that contains group of its own objects. 
In my case, I created the ```CompositePattern``` class, which was used to group different types of beverage, 
and for future use, in case there will appear new beverages, will be much easier to add or remove from the group, using the ```addBeverage()``` and ```removeBeverage()``` methods.

```java
public class CompositePattern implements IBeverage {
    private String name;

    private List<IBeverage> childBeverages; // property which allows us to create groups

    public CompositePattern(String name){
        this.name = name;
        this.childBeverages = new ArrayList<>();
    }

    public void addBeverage(IBeverage beverage){
        childBeverages.add(beverage);
    }

    public void removeBeverage(IBeverage beverage){
        childBeverages.remove(beverage);
    }

    @Override
    public void setName(String name){
        for (IBeverage childBeverage : childBeverages) {
            childBeverage.setName(name);
        }
    }
    @Override
    public void setPrice(float price) {
        for (IBeverage childBeverage : childBeverages) {
            childBeverage.setPrice(price);
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
```

Below it is shown the way it was used:
```java
...
IBeverage orangeJuice = new Juice("Orange", 12);
IBeverage appleJuice = new Juice("Apple", 13);

IBeverage greenTea = new Tea("Green", 14);
IBeverage blackTea = new Tea("Black", 15);

CompositePattern juices = new CompositePattern("Juices");
CompositePattern teas = new CompositePattern("Teas");
                
uices.addBeverage(orangeJuice);
juices.addBeverage(appleJuice);
                
teas.addBeverage(greenTea);
teas.addBeverage(blackTea);
...
```

* **Adapter**
While adding new functionalities to my system, I wanted to give the possibility to the client to buy not only sweets(chocolate and candies), but also drinks, too.
The Adapter gave me the possibility to make a connection between objects with a different interface. In my case, between ```ISweet``` and ```IBeverage```.
Respectively, first I have created the interface ```IBeverage```, an incompatible class, that needs to be adapted.

```java
public interface IBeverage {
    void setName(String name);
    void setPrice(float price);
    String getName();
}
```
After that, I created the adapter itself, called ```BeverageAdapter``` which implements the ```ISweet``` interface.

```java
public class BeverageAdapter implements ISweet {
    private final IBeverage juice;

    public BeverageAdapter(IBeverage beverage){
        this.juice = beverage;
    }

    public String toString(){
        return juice.toString();
    }

    @Override
    public String getDetails() {return null;    }

    @Override
    public void setName(String name) {  }

    @Override
    public void setCompany(String company) {}

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getCompany() {
        return null;
    }

    @Override
    public void setSugar(int sugar) {}

    @Override
    public int getSugar() {
        return 0;
    }
    @Override
    public void setPrice(double price) { }

    @Override
    public double getPrice() {
        return 0;
    }
}
```
In order to complete the previous design pattern on the client side, I did this:
```java
ISweet adaptedOrangeJuice = new BeverageAdapter(orangeJuice);
ISweet adaptedAppleJuice = new BeverageAdapter(appleJuice);

ISweet adaptedGreenTea = new BeverageAdapter(greenTea);
ISweet adaptedBlackTea = new BeverageAdapter(blackTea);
```
## Output
* Chocolate with custom packaging
* Chocolate with NO custom packaging
* Candies with custom packaging
* Chocolate with NO custom packaging
* Beverages

## Conclusions
After studying all the theory and putting it into practice in this laboratory work, 
I straighten my knowledge about Design Patterns, and namely about SDPs.
In short, they focus on how classes and objects can be composed into larger structures
and at the same time to keep these structures flexible and efficient. 
Another challenge that I have faced was to respect the project structure, but from my point of view, I managed to do it not so bad.
