package org.example.Inheritance;

public final class WaterPokemon extends Pokemon {

    public WaterPokemon(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + " used Bubble!");
    }

}