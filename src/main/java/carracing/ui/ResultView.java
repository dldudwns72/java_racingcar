package carracing.ui;

import carracing.Car;
import carracing.Cars;
import carracing.Racing;
import carracing.Winners;

import java.util.List;

public class ResultView {

    public static void printResult(Cars cars, int attemptCount) {
        System.out.println("실행 결과");

        Racing racing = new Racing(cars);

        Cars finishRacing = racing.game(attemptCount);

        printWinners(finishRacing);
    }


    private static void printWinners(Cars cars) {
        Winners winners = new Winners(cars);

        List<String> winnerList = winners.getWinners();


        String joinWinners = String.join(",", winnerList);

        System.out.printf(joinWinners + "가 최종 우승 하였습니다.");
    }
}
