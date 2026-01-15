package strategy;

import java.util.ArrayList;
public abstract class Animal {
    protected String name;
    protected ArrayList<String> character = new ArrayList<String>();
    protected moveBehavior moveBehavior;

    public Animal(String name) {
        this.name = name;
        this.character = new ArrayList<String>();
    }

    public void move() {
        moveBehavior.move();
    }

    public String toString() {
        return "Animal: " + name + ".\n" + character.toString();
    }
}