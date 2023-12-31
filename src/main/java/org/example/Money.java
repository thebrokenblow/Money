package org.example;

import java.util.Objects;

public class Money implements Expression {
    protected int amount;
    protected String currency;
    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Expression plus(Expression addend) {
        return new Sum(this, addend);
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

    public Expression times(int multiplier) {
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

    @Override
    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }
}