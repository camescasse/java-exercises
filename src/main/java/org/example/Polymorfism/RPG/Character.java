package org.example.Polymorfism.RPG;

public abstract class Character {
    protected String name;
    protected int healthPoints;
    protected int manaPoints;
    protected int power;

    public Character(String name, int healthPoints, int manaPoints, int power) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.manaPoints = manaPoints;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", healthPoints=" + healthPoints +
                ", manaPoints=" + manaPoints +
                '}';
    }

}
