package com.sda.balaceanuale.curs.advanced.generic;

import java.util.Optional;

public class GenericBox<T> {

    private T someItem;

    public void add(T someItem) {
        if (this.someItem == null) {
            this.someItem = someItem;
        }
    }
    public Optional<T> get() {
        if (someItem != null) {
            T result = someItem;
            this.someItem = null;
            return Optional.of(result);
        } else {
            return Optional.empty();
        }
    }
}
