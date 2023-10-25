package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
    extends TestCase
{
    public void testApp() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
