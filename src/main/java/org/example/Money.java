package org.example;

import java.util.Objects;

public class Money implements Expression {
    protected int amount;
    protected String currency;
    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money plus(Money added) {
        return new Money(amount + added.amount, currency);
    }
    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }
    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public String currency() {
        return currency;
    }

    public Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Money money) {
            return amount == money.amount &&
                    Objects.equals(currency, money.currency);
        }
        return false;
    }
}