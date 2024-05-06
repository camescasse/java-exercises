package org.example.Polymorfism.RPG;

public class Warrior extends Character implements Attack, Special, Moveable {

    public Warrior(String name) {
        super(name, 100, 20, 5);
    }

    @Override
    public void performAttack(Character character) {
        character.healthPoints -= power;
        System.out.println(name + " swings his sword towards " + character.getName() + "! Deals " + power + " HP.");
    }

    @Override
    public void performSpecial(Character character) {
        int consumedMana = 10;
        if (manaPoints >= consumedMana) {
            manaPoints -= consumedMana;
            power *= 1.4;
            System.out.println(name + " is enraged! Attacks are boosted by 20%! " + consumedMana + " MP consumed.");
        } else {
            System.out.println(name + " does not have enough mana. Current mana: " + manaPoints);
        }
    }

    @Override
    public void move() {
        System.out.println(name + " moves one space!");
    }

}
