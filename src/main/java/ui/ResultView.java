package ui;

import domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ResultView {

    public static void printResult(List<Car> cars) {
        List<String> winnerList = new ArrayList<>();
        String winner = null;
        int maxCount = 0;

        for (int i = 0; i < cars.size(); i++) {
            String currentCar = cars.get(i).getName();
            int lastCount = cars.get(i).getMoveCount();

            if (lastCount > maxCount) {

                winner = currentCar;
                maxCount = lastCount;
            }

            if (maxCount == lastCount) {
                winnerList.add(winner);
            }

        }

        System.out.println("실행 결과");

        for (int i = 0; i < winnerList.size(); i++) {
            System.out.print(winnerList.get(i) + " ");
        }

        System.out.print("가 최종 우승했습니다.");

    }


}
