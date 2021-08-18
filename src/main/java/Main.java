import domain.Car;
import domain.Cars;
import domain.Racing;
import ui.InputView;
import ui.ResultView;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cars cars = InputView.start();

        int attemptCount = InputView.attempt();

        Racing racing = new Racing(cars, attemptCount);

        Cars racingResult = racing.start();

        ResultView.printResult(racingResult);

    }

}
