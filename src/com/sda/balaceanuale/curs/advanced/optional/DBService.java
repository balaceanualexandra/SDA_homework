package com.sda.balaceanuale.curs.advanced.optional;

import java.util.Optional;

public class DBService {

    public Optional<Person> findByEmail(String email) {

        // se cauta in baza de date intrarea pentru contul ce are asociat adresa de email
        // data ca parametru
        // vrem sa intoarcem un obiect de tip Person ce are toate fieldurile populate
        // cu datele omului :)
        if (searchIsSuccessful()) {
            //trebuie sa returnam intrarea gasita, respectiv obiectul de tip person
            // sarim peste popularea fieldurilor, intoarcem un obiect gol de tip Person
            return Optional.of(new Person("Bogdan"));
        } else {
            //nu exista un obiect de tip person cu adresa de email data ca parametru
            // nu am ce sa intorc ?!?!?!?!
            // hai sa intorc o cutie goala
            return Optional.empty();
        }

    }

    private boolean searchIsSuccessful() {
        return true;
    }
}
