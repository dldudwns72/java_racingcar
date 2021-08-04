package domain;


public class Car {

    private String name;
    private int input_count;

    public Car(String name,int input_count) {
        isValid(name);
        this.name = name;
        this.input_count = input_count;
    }

    private void isValid(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("이름은 5자리를 넘길 수 없습니다.");
        }
    }

    public void printCar(){
        System.out.println(name + " : " +"-");
    }

    public String getName() {
        return name;
    }
}
