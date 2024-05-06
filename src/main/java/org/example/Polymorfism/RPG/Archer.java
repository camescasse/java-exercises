package org.example.Polymorfism.RPG;

public class Archer extends Character implements Attack, Moveable {

    public Archer(String name) {
        super(name, 60, 0, 8);
    }

    @Override
    public void performAttack(Character character) {
        System.out.println(name + " shoots an arrow towards " + character.getName() + "! Deals " + power + " HP.");
        character.healthPoints -= power;
    }

    @Override
    public void move() {
        System.out.println(name + " moves two spaces!");
    }

}
