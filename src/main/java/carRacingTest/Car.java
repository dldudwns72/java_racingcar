package carRacingTest;

public class Car {

    private int position;
    private String name;

    public Car(int position,String name){
        this.position = position;
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public String getName(){
        return name;
    }
}
