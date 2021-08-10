package domain;

import java.util.List;
import java.util.Random;

public class Cars {
    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void printNames(int attempt_count) {
        for (int i = 0; i < cars.size(); i++) {
            int randomNo = new Random().nextInt(10);
            Car car = cars.get(i);
            car.move(randomNo);
        }
        System.out.println("");
    }

    public List<Car> getCars() {
        return cars;
    }
}
