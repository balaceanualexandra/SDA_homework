package com.sda.balaceanuale.curs.advanced.inputOutput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Wallet implements Serializable {
    private double balance;
    private String brand;
    private List<Card> cards;

    public Wallet(String brand) {
        this.brand = brand;
        this.balance = 0;
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "balance=" + balance +
                ", brand='" + brand + '\'' +
                ", cards=" + cards +
                '}';
    }
}
