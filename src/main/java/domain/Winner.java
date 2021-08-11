package domain;

import java.util.ArrayList;
import java.util.List;

public class Winner {

    private List<Car> cars;
    int maxCount = 0;
    List<String> winner = new ArrayList<>();

    public Winner(List<Car> cars) {
        this.cars = cars;
    }

    public void judge() {
        for (int i = 0; i < cars.size(); i++) {

            int currentCount = cars.get(i).getMoveCount();

            if (maxCount < currentCount) {
                maxCount = currentCount;
                winner.add(cars.get(i).getName());
            }
        }

        String winnerPrint = String.join(", ", winner);

        System.out.println(winnerPrint + "가 최종 우승했습니다.");
    }
}
