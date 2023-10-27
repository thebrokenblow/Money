package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
    extends TestCase
{
    public void testReduceMoney() {
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1), "USD");
        assertEquals(Money.dollar(1), result);
    }
}
