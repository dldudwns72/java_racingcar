import domain.AttemptCount;
import domain.Car;
import domain.Cars;
import domain.Racing;
import ui.InputView;
import ui.ResultView;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cars cars = InputView.start();

        AttemptCount attemptCount = InputView.attempt();

        Racing racing = new Racing(cars, attemptCount);

        System.out.println("실행결과");

        Cars racingResult = racing.start();

        ResultView.printResult(racingResult);

    }

}
