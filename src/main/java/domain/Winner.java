package domain;

import java.util.ArrayList;
import java.util.List;

public class Winner {

    private List<Car> cars;
    int maxCount = 0;
    List<String> winners = new ArrayList<>();

    public Winner(List<Car> cars) {
        this.cars = cars;
    }

    public void judge() {
        for (int i = 0; i < cars.size(); i++) {

            if (i == 0) {
                if (cars.get(0).getMoveCount() < cars.get(1).getMoveCount()) {
                    maxCount = cars.get(1).getMoveCount();
                    winners.add(cars.get(1).getName());
                } else {
                    maxCount = cars.get(0).getMoveCount();
                    winners.add(cars.get(0).getName());
                }
            } else if (i < cars.size() - 1) {
                int nextCount = cars.get(i + 1).getMoveCount();

                if (maxCount < nextCount) {
                    maxCount = nextCount;
                    winners.add(cars.get(i + 1).getName());
                }else if(maxCount == nextCount){
                    maxCount = nextCount;
                    winners.add(cars.get(i + 1).getName());
                }

            }

        }

        String winnerPrint = String.join(", ", winners);

        System.out.println(winnerPrint + "가 최종 우승했습니다.");
    }
}
