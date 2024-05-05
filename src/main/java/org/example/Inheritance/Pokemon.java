package org.example.Inheritance;

public abstract class Pokemon {
    protected String name;
    protected int level;

    public Pokemon(String name) {
        this.name = name;
        this.level = 5;
    }

    public void levelUp() {
        level++;
    }

    public void attack() {
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }

}
