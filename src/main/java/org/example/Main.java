package org.example;

import org.example.Polymorfism.RPG.Archer;
import org.example.Polymorfism.RPG.Warrior;
import org.example.Polymorfism.RPG.Wizard;

public class Main {
    public static void main(String[] args) {
        var thor = new Warrior("Thor");
        var han = new Warrior("Han");
        thor.performAttack(han);
        thor.performSpecial(thor);
        thor.performAttack(han);
        System.out.println(han);
        thor.move();

        var harry = new Wizard("Harry");
        harry.performSpecial(han);
        harry.performSpecial(han);
        harry.performSpecial(han);
        harry.performSpecial(han);
        harry.performSpecial(han);
        System.out.println(harry);
        harry.performSpecial(han);
        harry.performAttack(han);
        System.out.println(han);

        var legolas = new Archer("Legolas");
        legolas.performAttack(han);
        legolas.move();
        System.out.println(han);
    }
}