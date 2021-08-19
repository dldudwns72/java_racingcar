package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Racing {

    private Cars cars;
    private AttemptCount attemptCount;

    public Racing(Cars cars, AttemptCount attemptCount) {
        this.cars = cars;
        this.attemptCount = attemptCount;
    }

    public Cars start() {

        for (int attemptIndex = 0; attemptIndex < attemptCount.getAttemptCount(); attemptIndex++) {

            inGame(cars);
            System.out.println("");
        }

        return cars;
    }

    private Cars inGame(Cars cars) {

        for (int i = 0; i < cars.getCars().size(); i++) {
            int randomNo = new Random().nextInt(10);

            Car car = cars.getCars().get(i);

            car.move(randomNo);

            printCars(car.getName(),car.getMoveCount());

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
