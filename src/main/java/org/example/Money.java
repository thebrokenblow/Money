package org.example;

public class Money {
    protected int amount;
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Money money) {
            return amount == money.amount;
        }
        return false;
    }
}
