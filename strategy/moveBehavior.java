package strategy;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
public abstract class moveBehavior {
    private static final int NUM_MOVES = 3;
    private int speed;
    private ArrayList<String> character;

    public moveBehavior(ArrayList<String> character, int speed) {
        this.character = character;
        this.speed = speed;
    }

    public abstract void move();

    protected void move(boolean  jump) {
        for(int i = 0; i < NUM_MOVES; i++) {
            pushCharacterForward();
            displayCharacter();
        };
        clear();
    }

    private void pushCharacterForward() {
        for(int i = 0; i < character.size(); i++) {
            character.set(i, " " + character.get(i));
        }
    }

    private void displayCharacter() {
        for(String line : character) {
            System.out.println(line);
        }
    }

    /**
    * Pauses the program
     * 
     * @param num The miliseconds to pause the program for
     */

    private void sleep(int num) {
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println("Timmer error");
        }
    }

    /**
     * Clears the console
     */
    private void clear() {
        System.out.print("\033[H\033[2J");
    }





}