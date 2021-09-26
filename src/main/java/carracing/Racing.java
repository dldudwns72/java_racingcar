package carracing;

import java.util.Random;

public class Racing {

    private Cars cars;

    public Racing(Cars cars) {
        this.cars = cars;
    }

    public Cars game(int attemptCount) {

        for (int i = 0; i < attemptCount; i++) {
            carMove();
            System.out.printf("%n");
        }

        return cars;
    }

    private void carMove() {
        for (int i = 0; i < cars.getCarList().size(); i++) {
            Car car = cars.getCarList().get(i);

            car.move(randomNumber());

            System.out.printf(car.getName() + " : ");

            printMoveCount(car);

            System.out.printf("%n");
        }
    }

    public int randomNumber() {
        Random random = new Random();

        int randomNumber = random.nextInt(10);

        return randomNumber;
    }

    private void printMoveCount(Car car) {
        for (int j = 0; j < car.getPosition(); j++) {
            System.out.print("-");
        }
    }
}
