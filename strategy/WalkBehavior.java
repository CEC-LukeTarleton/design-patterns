package strategy;

import java.util.ArrayList;
public class WalkBehavior extends moveBehavior {
    public WalkBehavior(ArrayList<String> character, int speed) {
        super(character, speed);
    }

    public void move() {
        move(false);
    }

}