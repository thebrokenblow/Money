package org.example;

import com.sun.source.doctree.EscapeTree;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
    extends TestCase
{
    public void testReduceMoney() {
        assertEquals(1, new Bank().rate("USD", "USD"));
    }

    public void testMixedAddition() {
        Expression fiveBucks = Money.dollar(5);
        Expression tenFranck = Money.franc(10);

        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(fiveBucks.plus(tenFranck), "USD");
        assertEquals(Money.dollar(10).amount, result.amount);
    }
}
