package com.sda.balaceanuale.curs.advanced.generic;

import java.util.Optional;

public class NecklaceBox {
    private Necklace necklace;

    public void add(Necklace necklace) {
        if (this.necklace == null) {
            this.necklace = necklace;
        }
    }
    public Optional<Necklace> get() {
        if (necklace != null) {
            Necklace result = necklace;
            this.necklace = null;
            return Optional.of(result);
        } else {
            return Optional.empty();
        }
    }
}
