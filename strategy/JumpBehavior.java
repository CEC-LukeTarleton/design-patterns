package strategy;

import java.util.ArrayList;
public class JumpBehavior extends moveBehavior {
    JumpBehavior(ArrayList<String> character, int speed) {
        super(character, speed);
    }


    public void move() {
        move(true);
    }

}