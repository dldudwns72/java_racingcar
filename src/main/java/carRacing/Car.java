package carRacing;

import carRacing.exception.CarException;

import java.util.Objects;

public class Car {

    private int position;
    private String name;

    public Car(int position, String name) {
        nameRangeValid(name);
        this.position = position;
        this.name = name;
    }

    private void nameRangeValid(String name) {
        if (name.length() > 5) {
            throw new CarException("이름은 5자를 넘길 수 없습니다.");
        }
    }

    public void move(int number) {
        if (number > 5) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return position == car.position && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, name);
    }

}
