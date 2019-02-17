package test.java.com.ubitoffee.tdd;

import main.java.com.ubitoffee.tdd.currency.Franc;
import main.java.com.ubitoffee.tdd.currency.Money;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {

    @Test
    public void testMultiplication() {
        Money money = Money.dollar(5);
        assertEquals(Money.dollar(10), money.times(2));
        assertEquals(Money.dollar(15), money.times(3));
    }

    @Test
    public void testDifferentClassEquality() {
        assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
    }

    @Test
    public void testFrancMultiplication() {
        Money money = Money.franc(5);
        assertEquals(Money.franc(10), money.times(2));
        assertEquals(Money.franc(15), money.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));
        assertFalse(Money.dollar(5).equals(Money.franc(5)));
    }
}