package domain;

import java.util.Random;

public class Car {
    private String name;

    private int moveCount;


    public Car(String name,int moveCount){
        this.name = name;
        this.moveCount = moveCount;
    }

    public Car(String name){
        this.name = name;
    }

    public void move(int attemptCount){

        for (int i = 0; i < attemptCount; i++) {
            Random random = new Random();

            // 0~10사이의 난수
            int random_number = random.nextInt(10);

            if(random_number > 5){
                // 해당 move_count 값을 어떻게 유지하고 있는가.
                moveCount++;
            }
        }

    }

    public void print(){
        StringBuilder going_count = new StringBuilder();
        going_count.append("-");

        for (int i = 1; i < moveCount; i++) {
            going_count.append("-");
        }

        System.out.println(name + " : " + going_count);
    }

    public String getName() {
        return name;
    }

    public int getMoveCount() {
        return moveCount;
    }
}
