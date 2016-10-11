package by.bsu.fpm.barbuk.candies;


public abstract class Candy {
    private String candyName;
    private Integer weight;
    private Integer cost;

    public Candy() {
    }

    public Candy(String candyName, int weight, int cost) {
        this.candyName = candyName;
        this.weight = weight;
        this.cost = cost;
    }

    public String getCandyName() {
        return candyName;
    }

    public void setCandyName(String candyName) {
        this.candyName = candyName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return  "candyName='" + candyName + '\'' +
                ", weight=" + weight +
                ", cost=" + cost;
    }
}
