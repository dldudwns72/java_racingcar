package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Racing {

    private List<Car> cars;
    private int attemptCount;

    public Racing(List<Car> cars, int attemptCount){
        this.cars = cars;
        this.attemptCount = attemptCount;
    }

    public List<Car> start(){
        List<Car> result = new ArrayList<>();

        System.out.println("attemptCount" + attemptCount);
        for (int attemptIndex = 0; attemptIndex < attemptCount; attemptIndex++) {
            Car car = inGame(cars.get(attemptIndex),attemptIndex);
            result.add(car);
        }

        return result;
    }

    private Car inGame(Car car, int attemptIndex){

        for (int i = 0; i < attemptIndex+1; i++) {
            System.out.println("attemptIndex" + attemptIndex);

            int randomNo = new Random().nextInt(10);
            car.move(randomNo);
        }

        return car;
    }


}
