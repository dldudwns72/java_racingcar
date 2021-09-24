package carRacing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Winners {

    private Cars cars;

    public Winners(Cars cars) {
        this.cars = cars;
    }

    public List<String> getWinners() {
        List<String> carNameList = new ArrayList<>();

        List<String> winners = judgeWinner(cars);

        for (int i = 0; i < winners.size(); i++) {
            String winner = winners.get(i);
            carNameList.add(winner);
        }

        return carNameList;
    }

    private List<String> judgeWinner(Cars cars){
        List<String> winners = new ArrayList<>();
        List<Integer> carsPosition = new ArrayList<>();

        for (int i = 0; i < cars.getCarList().size(); i++) {
            Car car = cars.getCarList().get(i);
            carsPosition.add(car.getPosition());
        }

        int maxPosition = Collections.max(carsPosition);

        for (int i = 0; i < cars.getCarList().size(); i++) {
            Car car = cars.getCarList().get(i);

            if(car.getPosition() == maxPosition){
                winners.add(car.getName());
            }
        }

        return winners;
    }
}
