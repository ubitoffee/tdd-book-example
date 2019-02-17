package main.java.com.ubitoffee.tdd.currency;

public class Franc extends Money {

    protected Franc(int amount) {
        this.amount = amount;
    }

    public Money times(int time) {
        int newAmount = amount * time;
        return new Franc(newAmount);
    }
}
