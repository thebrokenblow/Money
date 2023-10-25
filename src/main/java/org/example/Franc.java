package org.example;

public class Franc {
    private final int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Franc franc) {
            return amount == franc.amount;
        }
        return false;
    }
}
