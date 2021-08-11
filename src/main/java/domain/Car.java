package domain;

public class Car {
    private String name;

    private int moveCount = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move(int randomNo) {
        if (randomNo > 3) {
            this.moveCount++;
        }
    }

    public String getName() {
        return name;
    }

    public int getMoveCount() {
        return moveCount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", moveCount=" + moveCount +
                '}';
    }
}
