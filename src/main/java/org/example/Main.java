package org.example;

import org.example.Inheritance.FirePokemon;
import org.example.Inheritance.WaterPokemon;

public class Main {
    public static void main(String[] args) {
        var mudkip = new WaterPokemon("Squirtle");
        System.out.println(mudkip);
        mudkip.levelUp();
        System.out.println(mudkip);
        mudkip.attack();
        var torchic = new FirePokemon("Torchic");
        System.out.println(torchic);
        torchic.levelUp();
        System.out.println(torchic);
        torchic.attack();
    }
}