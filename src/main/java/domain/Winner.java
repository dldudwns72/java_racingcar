package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Winner {

    private List<Car> cars;
    List<String> winners = new ArrayList<>();

    public Winner(List<Car> cars) {
        this.cars = cars;
    }

    public void judge() {

        int maxCount = getMaxCount(cars);

        for (int i = 0; i < cars.size(); i++) {
            getWinners(cars.get(i),maxCount);
        }

        String winnerPrint = String.join(", ", winners);

        System.out.println(winnerPrint + "가 최종 우승했습니다.");
    }

    private int getMaxCount(List<Car> cars) {
        List<Integer> moveCountList = new ArrayList<>();

        for (int i = 0; i < cars.size(); i++) {
            moveCountList.add(cars.get(i).getMoveCount());
        }

        return Collections.max(moveCountList);
    }

    private void getWinners(Car car, int maxCount){
        if(car.getMoveCount() == maxCount){
            winners.add(car.getName());
        }
    }

}
