package client;

//import domain.decorator.CustomPackaging;
import domain.adapter.BeverageAdapter;
import domain.composite.CompositePattern;
import domain.factories.abstractions.IAbstractFactory;
import domain.factories.implementations.CandyFactory;
import domain.factories.implementations.ChocolateFactory;
import domain.strategy.implementation.Birthday;
import domain.strategy.implementation.Context;
import domain.strategy.implementation.DiscountCard;
import models.beverages.abstractions.IBeverage;
import models.beverages.implementations.Juice;
import models.beverages.implementations.Tea;
import models.sweets.abstractions.ISweet;
import models.sweets.implementations.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String RED = "\033[0;31m";    // RED

    public static final String RESET = "\033[0m";  // Text Reset
    public static void main(String[] args) throws IOException{

        label:
        while(true) {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\n---Welcome to our SweetShop!---\nWhat you would like to buy?\n*chocolate \n*candies  \n*beverage \nIf you want to exit press X ");
            String type = input.readLine();
            if (type.length() == 0)
                break;

            if (type.equals("chocolate")) {
                System.out.println("Do you have a Discount Card? y/n");
                String ans = input.readLine();

                System.out.println("Do you want custom packaging? y/n");
                String type2 = input.readLine();
                if(type2.equals("n"))
                {
//                    needsCustomPackage = false
                        IAbstractFactory chocolateFactory = ChocolateFactory.getChocolateFactory();
                        System.out.println(chocolateFactory.sellSweet("white chocolate", false).toString());
                        System.out.println(chocolateFactory.sellSweet("milk chocolate", false).toString());
                        System.out.println(chocolateFactory.sellSweet("dark chocolate", false).toString());
//                      no discount card
                        if (ans.equals("n")) {
                            System.out.println(CYAN + "How unfortunate! Maybe is your birthday today?" + RESET);
                            String bday = input.readLine();
//                            birthday discount
                            if (bday.equals("y")){
                                Context context = new Context(new Birthday());
                                System.out.println(RED + "Prices for your birthday");
                                System.out.println("White Chocolate:" + context.executeStrategy(WhiteChocolate.givePrice()));
                                System.out.println("Milk Chocolate:" + context.executeStrategy(MilkChocolate.givePrice()));
                                System.out.println("Dark Chocolate:" + context.executeStrategy(DarkChocolate.givePrice()) + RESET);
                            }
                    }
                    if (ans.equals("y")){
                        Context context = new Context(new DiscountCard());
                        System.out.println(RED + "Prices with your 10% discount card");
                        System.out.println("White Chocolate:" + context.executeStrategy(WhiteChocolate.givePrice()));
                        System.out.println("Milk Chocolate:" + context.executeStrategy(MilkChocolate.givePrice()));
                        System.out.println("Dark Chocolate:" + context.executeStrategy(DarkChocolate.givePrice()) + RESET);

                    }


                }
                else{
//                    needsCustomPackage = true;
                    IAbstractFactory chocolateFactory = ChocolateFactory.getChocolateFactory();
                    System.out.println(chocolateFactory.sellSweet("white chocolate", true).toString());
                    System.out.println(chocolateFactory.sellSweet("milk chocolate", true).toString());
                    System.out.println(chocolateFactory.sellSweet("dark chocolate", true).toString());
                    //                      no discount card
                    if (ans.equals("n")) {
                        System.out.println(CYAN + "How unfortunate! Maybe is your birthday today?" + RESET);
                        String bday = input.readLine();
//                            birthday discount
                        if (bday.equals("y")){
                            Context context = new Context(new Birthday());
                            System.out.println(RED + "Prices for your birthday");
                            System.out.println("White Chocolate:" + context.executeStrategy(WhiteChocolate.givePrice()));
                            System.out.println("Milk Chocolate:" + context.executeStrategy(MilkChocolate.givePrice()));
                            System.out.println("Dark Chocolate:" + context.executeStrategy(DarkChocolate.givePrice()) + RESET);
                        }
                    }
                    if (ans.equals("y")){
                        Context context = new Context(new DiscountCard());
                        System.out.println(RED + "Prices with your 10% discount card");
                        System.out.println("White Chocolate:" + context.executeStrategy(WhiteChocolate.givePrice()));
                        System.out.println("Milk Chocolate:" + context.executeStrategy(MilkChocolate.givePrice()));
                        System.out.println("Dark Chocolate:" + context.executeStrategy(DarkChocolate.givePrice()) + RESET);
                    }
                }
                break;
            } else if (type.equals("candies")) {
                System.out.println("Do you have a Discount Card? y/n");
                String ans = input.readLine();
                System.out.println("Do you want custom packaging? y/n");
                String type2 = input.readLine();
//                no custom packaging
                if(type2.equals("n")) {

                    IAbstractFactory candyFactory = CandyFactory.getCandyFactory();
                    System.out.println(candyFactory.sellSweet("lollipop", false).toString());
                    System.out.println(candyFactory.sellSweet("goldenbears", false).toString());
                    System.out.println(candyFactory.sellSweet("candy", false).toString());
//                    no discount card
                    if (ans.equals("n")) {
                        System.out.println(CYAN + "How unfortunate! Maybe is your birthday today?" + RESET);
                        String bday = input.readLine();
//                            birthday discount
                        if (bday.equals("y")){
                            Context context = new Context(new Birthday());
                            System.out.println(RED + "Prices for your birthday");
                            System.out.println("Lollipop:" + context.executeStrategy(Lollipop.givePrice()));
                            System.out.println("Golden Bears:" + context.executeStrategy(GoldBears.givePrice()));
                            System.out.println("Candy:" + context.executeStrategy(Candy.givePrice()) + RESET);
                        }

                        else{
                            break;
                        }
                    }
//                        discount card
                    if (ans.equals("y")){
                        Context context = new Context(new DiscountCard());
                        System.out.println(RED + "Prices with your discount card");
                        System.out.println("Lollipop:" + context.executeStrategy(Lollipop.givePrice()));
                        System.out.println("Golden Bears:" + context.executeStrategy(GoldBears.givePrice()));
                        System.out.println("Candy:" + context.executeStrategy(Candy.givePrice()) + RESET);
                    }
                }else{
                    IAbstractFactory candyFactory = CandyFactory.getCandyFactory();
                    System.out.println(candyFactory.sellSweet("lollipop", true).toString());
                    System.out.println(candyFactory.sellSweet("goldenbears", true).toString());
                    System.out.println(candyFactory.sellSweet("candy", true).toString());
//                    no discount card
                    if (ans.equals("n")) {
                        System.out.println(CYAN + "How unfortunate! Maybe is your birthday today?" + RESET);
                        String bday = input.readLine();
//                            birthday discount
                        if (bday.equals("y")){
                            Context context = new Context(new Birthday());
                            System.out.println(RED + "Prices for your birthday");
                            System.out.println("Lollipop:" + context.executeStrategy(Lollipop.givePrice()));
                            System.out.println("Golden Bears:" + context.executeStrategy(GoldBears.givePrice()));
                            System.out.println("Candy:" + context.executeStrategy(Candy.givePrice()) + RESET);
                        }
                        else {
                            break ;
                        }
                    }
//                        discount card
                    if (ans.equals("y")){
                        Context context = new Context(new DiscountCard());
                        System.out.println(RED + "Prices with your discount card");
                        System.out.println("Lollipop:" + context.executeStrategy(Lollipop.givePrice()));
                        System.out.println("Golden Bears:" + context.executeStrategy(GoldBears.givePrice()));
                        System.out.println("Candy:" + context.executeStrategy(Candy.givePrice()) + RESET);
                    }
                }
                break;
            } else if (type.equals("beverage")){
                IBeverage orangeJuice = new Juice("Orange", 12);
                IBeverage appleJuice = new Juice("Apple", 13);

                IBeverage greenTea = new Tea("Green", 14);
                IBeverage blackTea = new Tea("Black", 15);

                CompositePattern juices = new CompositePattern("Juices");

                CompositePattern teas = new CompositePattern("Teas");
                juices.addBeverage(orangeJuice);
                juices.addBeverage(appleJuice);
                teas.addBeverage(greenTea);
                teas.addBeverage(blackTea);

                System.out.println(CYAN + '*' + juices.getName() + "\n" + RESET);
                ISweet adaptedOrangeJuice = new BeverageAdapter(orangeJuice);
                ISweet adaptedAppleJuice = new BeverageAdapter(appleJuice);

                System.out.println(adaptedOrangeJuice.toString());
                System.out.println(adaptedAppleJuice.toString());


                System.out.println(CYAN + '*' + teas.getName() + "\n" + RESET);
                ISweet adaptedGreenTea = new BeverageAdapter(greenTea);
                ISweet adaptedBlackTea = new BeverageAdapter(blackTea);
                System.out.println(adaptedGreenTea.toString());
                System.out.println(adaptedBlackTea.toString());

                break;
            }
            else if (type.equals("X"))
                break label;
            else{
                System.out.println("Oh no, we don't have this type of sweets :(");
                break;
            }
        }
    }
}
