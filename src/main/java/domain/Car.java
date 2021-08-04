package domain;


public class Car {

    private String name;
    private int count;

    public Car(String name) {
        isValid(name);
        this.name = name;
    }

    private void isValid(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("이름은 5자리를 넘길 수 없습니다.");
        }
    }

    public String printName(){
        return name + " : " +"-";
    }


}
