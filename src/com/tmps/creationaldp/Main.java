package com.tmps.creationaldp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        label:
        while(true) {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nWelcome to our SweetShop!\nWhat you would like to buy: chocolate or candies? \nIf you want to exit press X ");
            String type = input.readLine();
            if (type.length() == 0)
                break;

            if (type.equals("chocolate")){
                AbstractFactory chocolateFactory = ChocolateFactory.getChocolateFactory();
                System.out.println(chocolateFactory.sellSweet("white chocolate").toString());
                System.out.println(chocolateFactory.sellSweet("milk chocolate").toString());
                System.out.println(chocolateFactory.sellSweet("dark chocolate").toString());
                break ;
            } else if (type.equals("candies")){
                AbstractFactory candyFactory = CandyFactory.getCandyFactory();
                System.out.println(candyFactory.sellSweet("lollipop").toString());
                System.out.println(candyFactory.sellSweet("goldenbears").toString());
                System.out.println(candyFactory.sellSweet("candy").toString());
                break;
            } else if (type.equals("X"))
                break label;
            else{
                System.out.println("Oh no, we don't have this type of sweets :(");
                break;
            }
        }
    }
}
