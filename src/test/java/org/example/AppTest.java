package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
    extends TestCase
{
    public void testApp()
    {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(five.amount, 10);
    }
}
