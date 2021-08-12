package domain;

import Exceptions.NameValidationException;

public class Car {
    private String name;

    private int moveCount = 0;

    public Car(String name) {
        valid(name);
        this.name = name;
    }

    public void move(int randomNo) {
        if (randomNo > 3) {
            this.moveCount++;
        }
    }

    private void valid(String name){
        if(name.length() > 5){
            throw new NameValidationException("이름은 5자 이상 될 수 없습니다.");
        }

        if(name.length() == 0 ){
            throw new NameValidationException("1자리 이상의 이름을 입력해 주세요.");
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
