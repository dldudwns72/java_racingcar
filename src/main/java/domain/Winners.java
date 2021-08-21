package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Winners {

    private Cars cars;

    public Winners(Cars cars) {
        this.cars = cars;
    }

    public String judge() {

        int maxCount = getMaxCount(cars);
        List<String> carNames = new ArrayList<>();

        for (int i = 0; i < cars.getCars().size(); i++) {
            Car car = cars.getCars().get(i);
            carNames.add(getWinners(car, maxCount));
        }

        WinnerList winnerList = new WinnerList(carNames);

        // 공백과 null 제거ㅎ
        winnerList.getWinnerList().removeAll(Arrays.asList("",null));

        String winnerPrint = String.join(", ", winnerList.getWinnerList());

        return winnerPrint;
    }

    private int getMaxCount(Cars cars) {
        List<Integer> moveCountList = new ArrayList<>();

        for (int i = 0; i < cars.getCars().size(); i++) {
            Car car = cars.getCars().get(i);
            moveCountList.add(car.getMoveCount());
        }

        return Collections.max(moveCountList);
    }

    private String getWinners(Car car, int maxCount) {

        if (car.getMoveCount() == maxCount) {
            return car.getName();
        }

        return null;


    }

}
