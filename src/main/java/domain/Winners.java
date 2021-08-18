package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Winners {

    private Cars cars;
    private List<String> winners = new ArrayList<>();

    public Winners(Cars cars) {
        this.cars = cars;
    }

    public void judge() {

        int maxCount = getMaxCount(cars);

        for (int i = 0; i < cars.getCars().size(); i++) {
            Car car = cars.getCars().get(i);
            getWinners(car,maxCount);
        }

        String winnerPrint = String.join(", ", winners);

        System.out.println(winnerPrint + "가 최종 우승했습니다.");
    }

    private int getMaxCount(Cars cars) {
        List<Integer> moveCountList = new ArrayList<>();

        for (int i = 0; i < cars.getCars().size(); i++) {
            Car car = cars.getCars().get(i);
            moveCountList.add(car.getMoveCount());
        }

        return Collections.max(moveCountList);
    }

    private void getWinners(Car car, int maxCount){
        if(car.getMoveCount() == maxCount){
            winners.add(car.getName());
        }
    }

}
