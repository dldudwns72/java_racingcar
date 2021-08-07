package domain;

import java.util.List;

public class Cars {
    private List<Car> cars;
    private int attempt_count;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void printNames() {
        for (int i = 0; i < cars.size(); i++) {

            Car car = cars.get(i); // Car의 정보 (name과 move_count)

            // move는 내부적에서 계속 돌아야한다.
            car.move();

            car.print();
        }
        System.out.println("");
    }

    public List<Car> getCars() {
        return cars;
    }
}
