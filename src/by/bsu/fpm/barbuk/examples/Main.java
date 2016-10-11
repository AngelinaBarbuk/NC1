package by.bsu.fpm.barbuk.examples;

import by.bsu.fpm.barbuk.candies.Candy;
import by.bsu.fpm.barbuk.gifts.Gift;
import by.bsu.fpm.barbuk.patterns.CandyFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    public static void main(String args[]){
        Gift gift = new Gift();
        try {
            File file = new File("src/input.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                Candy candy = CandyFactory.getCandy(sc,sc.next());
                gift.addCandy(candy);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        gift.printCandiesList();
        System.out.println("Current weight "+gift.calculateGiftWeight());
        System.out.println("\n Sorted by weight:");
        gift.sortByWeight();
        gift.printCandiesList();
        System.out.println("\n Sorted by cost:");
        gift.sortByCost();
        gift.printCandiesList();
        System.out.println("\n Sorted by name:");
        gift.sortByName();
        gift.printCandiesList();
        System.out.println();
        System.out.println("Candies in cost ranges from 5 to 7 ");
        System.out.println(gift.findByCostRange(5,7));
    }
}
