package com.sda.balaceanuale.curs.advanced.generic;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Shoes shoes = new Shoes();
        ShoeBox shoeBox = new ShoeBox();

        shoeBox.add(shoes);

        Optional<Shoes> shoes1 = shoeBox.get();
        Optional<Shoes> shoes2 = shoeBox.get();
        System.out.println(shoes1.isPresent());
        System.out.println(shoes2.isPresent());


        GenericBox<Shoes> shoesGenericBox = new GenericBox<>();
        shoesGenericBox.add(shoes);

        GenericBox<Necklace> necklaceGenericBox = new GenericBox<>();
        necklaceGenericBox.add(new Necklace());

    }
}
