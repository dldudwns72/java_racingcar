package domain;

import java.util.List;
/*
    한 게임에 대한 정보들
 */
public class Cars {
    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void printNames(int attempt_count) {
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i); // Car의 정보 (name과 move_count)

            // move는 내부적에서 계속 돌아야한다.
            car.move(attempt_count);

            car.print();
        }
        System.out.println("");
    }

    public List<Car> getCars() {
        return cars;
    }
}
