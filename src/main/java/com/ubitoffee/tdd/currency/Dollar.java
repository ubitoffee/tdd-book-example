package main.java.com.ubitoffee.tdd.currency;

public class Dollar extends Money {

    protected Dollar(int amount) {
        this.amount = amount;
    }

    public Money times(int time) {
        int newAmount = amount * time;
        return new Dollar(newAmount);
    }
}
