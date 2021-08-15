package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Racing {

    private List<Car> cars;
    private int attemptCount;

    public Racing(List<Car> cars, int attemptCount) {
        this.cars = cars;
        this.attemptCount = attemptCount;
    }

    public List<Car> start() {
        List<Car> result = new ArrayList<>();

        System.out.println("실행결과");

        for (int attemptIndex = 0; attemptIndex < attemptCount; attemptIndex++) {
            result = inGame(cars);
            System.out.println("");
        }

        return result;
    }

    private List<Car> inGame(List<Car> cars) {

        for (int i = 0; i < cars.size(); i++) {
            int randomNo = new Random().nextInt(10);
            cars.get(i).move(randomNo);

            printCars(cars.get(i).getName(),cars.get(i).getMoveCount());

        }

        return cars;
    }

    private void printCars(String carName, int carMoveCount){
        StringBuilder carMoveCountChar = new StringBuilder();
        for (int i = 0; i < carMoveCount ; i++) {
            carMoveCountChar.append("-");
        }
        System.out.println(carName + " : " + carMoveCountChar);

    }



}
