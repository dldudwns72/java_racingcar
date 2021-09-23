package carRacing;

import carRacing.exception.CarException;

public class Car {

    private int position;
    private String name;

    public Car(int position,String name){
        nameRangeValid(name);
        this.position = position;
        this.name = name;
    }

    private void nameRangeValid(String name){
        if(name.length() > 5){
            throw new CarException("이름은 5자를 넘길 수 없습니다.");
        }
    }

    public int getPosition() {
        return position;
    }

    public String getName(){
        return name;
    }
}
