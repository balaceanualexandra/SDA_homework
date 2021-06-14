package com.sda.balaceanuale.curs.advanced.generic;

import java.util.Optional;

public class ShoeBox {
    private Shoes shoes;
    public void add(Shoes shoes) {
        if (this.shoes == null) {
            this.shoes = shoes;
        }
    }
    public Optional<Shoes> get() {
        if (shoes != null) {
            Shoes result = shoes;
            this.shoes = null;
            return Optional.of(result);
        } else {
            return Optional.empty();
        }
    }
}
