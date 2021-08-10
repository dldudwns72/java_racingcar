package domain;

import java.util.Random;

public class Car {
    private String name;

    private int moveCount = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move() {
        if (getRandomNumber() > 5) {
            this.moveCount++;
        }
    }

    public String print() {
        StringBuilder goingCount = new StringBuilder();
        goingCount.append("-");

        for (int i = 1; i < moveCount; i++) {
            goingCount.append("-");
        }

        return name + " : " + goingCount;
    }

    protected int getRandomNumber(){
        return new Random().nextInt(10);
    }

    public String getName() {
        return name;
    }

    public int getMoveCount() {
        return moveCount;
    }
}
