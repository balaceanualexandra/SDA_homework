package com.sda.balaceanuale.curs.advanced.inputOutput;

import java.io.Serializable;

public class Card implements Serializable {
    private String bank;
    private String number;

    public Card(String bank, String number) {
        this.bank = bank;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Card{" +
                "bank='" + bank + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
