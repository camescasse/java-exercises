package org.example.Polymorfism.RPG;

public class Wizard extends Character implements Attack, Special {

    public Wizard(String name) {
        super(name, 20, 100, 4);
    }

    @Override
    public void performAttack(Character character) {
        System.out.println(name + " shoots a fireball towards " + character.getName() + "! Deals " + power + " HP.");
        character.healthPoints -= power;
    }

    @Override
    public void performSpecial(Character character) {
        int consumedMana = 20;
        if (manaPoints >= consumedMana) {
            manaPoints -= consumedMana;
            int specialPower = power * 2;
            character.healthPoints -= specialPower;
            System.out.println(name + " casts his ultimate spell! Deals " + (specialPower) + " HP. " + consumedMana + " MP consumed.");
        } else {
            System.out.println(name + " does not have enough mana. Current mana: " + manaPoints);
            }
    }

}
