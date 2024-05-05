package org.example.Inheritance;

public final class FirePokemon extends Pokemon {

    public FirePokemon(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " used Ember!");
    }

}
