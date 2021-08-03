package domain;


public class Car {

    private String name;

    public Car(String name){
        isValid(name);
        name = this.name;
    }

    private void isValid(String name){
        if(name.length() > 5){
            throw new IllegalArgumentException("이름은 5자리를 넘길 수 없습니다.");
        }
    }


}
