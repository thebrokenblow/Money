package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
    extends TestCase
{
    public void testDollarApp() {
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduce = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduce);
    }
    public void testFrancApp() {
    }
}
