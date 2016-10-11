package by.bsu.fpm.barbuk.patterns;

import by.bsu.fpm.barbuk.candies.Candy;
import by.bsu.fpm.barbuk.candies.ChocolateCandy;
import by.bsu.fpm.barbuk.candies.Lollipop;
import by.bsu.fpm.barbuk.candies.NutCandy;

import java.util.Scanner;


public class CandyFactory {

    private static final String LOLLIPOP = "Lollipop";
    private static final String CHOCOLATE = "Chocolate";
    private static final String NUT = "Nut";

    public static Candy getCandy(Scanner scanner, String candyType){
        if(candyType==null)
            return null;
        switch (candyType){
            case LOLLIPOP:
                Lollipop lollipop = new Lollipop();
                lollipop.setCandyName(scanner.next());
                lollipop.setWeight(scanner.nextInt());
                lollipop.setCost(scanner.nextInt());
                lollipop.setColor(scanner.next());
                return lollipop;
            case CHOCOLATE:
                ChocolateCandy chocolateCandy = new ChocolateCandy();
                chocolateCandy.setCandyName(scanner.next());
                chocolateCandy.setWeight(scanner.nextInt());
                chocolateCandy.setCost(scanner.nextInt());
                return chocolateCandy;
            case NUT:
                NutCandy nutCandy = new NutCandy();
                nutCandy.setCandyName(scanner.next());
                nutCandy.setWeight(scanner.nextInt());
                nutCandy.setCost(scanner.nextInt());
                nutCandy.setNutName(scanner.next());
                return nutCandy;
        }
        return null;
    }
}
