package domain;

import java.util.List;

public class Cars {
    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void printNames(int attempt_count) {
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);

            car.move(attempt_count);

            car.print();
        }
        System.out.println("");
    }

    public List<Car> getCars() {
        return cars;
    }
}
