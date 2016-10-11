package by.bsu.fpm.barbuk.gifts;

import by.bsu.fpm.barbuk.candies.Candy;
import by.bsu.fpm.barbuk.candies.Lollipop;
import by.bsu.fpm.barbuk.comparators.CostComparator;
import by.bsu.fpm.barbuk.comparators.NameComparator;
import by.bsu.fpm.barbuk.comparators.WeightComparator;
import by.bsu.fpm.barbuk.giftInterfaces.GiftFind;
import by.bsu.fpm.barbuk.giftInterfaces.GiftSort;
import by.bsu.fpm.barbuk.giftInterfaces.GiftWeight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Gift implements GiftSort,GiftWeight, GiftFind {

    private List<Candy> candies;

    public Gift() {
        candies = new ArrayList<>();
    }

    public void addCandy(Candy candy){
        candies.add(candy);
    }

    public void printCandiesList(){
        for (Candy candy :candies)
            System.out.println(candy);
    }

    @Override
    public int calculateGiftWeight() {
        int weight=0;
        for(Candy candy:candies){
            weight+=candy.getWeight();
        }
        return weight;
    }

    @Override
    public void sortByName() {
        Collections.sort(candies,new NameComparator());
    }

    @Override
    public void sortByWeight() {
        Collections.sort(candies,new WeightComparator());
    }

    @Override
    public void sortByCost() {
        Collections.sort(candies,new CostComparator());
    }

    @Override
    public List<Candy> findByName(String name) {
        List<Candy> findCandies = new ArrayList<>();
        for(Candy candy:candies)
            if(candy.getCandyName().equals(name))
                findCandies.add(candy);
        return findCandies;
    }

    @Override
    public List<Candy> findByCostRange(int minCost, int maxCost) {
        List<Candy> findCandies = new ArrayList<>();
        for(Candy candy:candies)
            if(candy.getCost()>=minCost&&candy.getCost()<=maxCost)
                findCandies.add(candy);
        return findCandies;
    }

    @Override
    public List<Candy> findByWeightRange(int minWeight, int maxWeight) {
        List<Candy> findCandies = new ArrayList<>();
        for(Candy candy:candies)
            if(candy.getWeight()>=minWeight&&candy.getWeight()<=maxWeight)
                findCandies.add(candy);
        return findCandies;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "candies=" + candies +
                '}';
    }
}
