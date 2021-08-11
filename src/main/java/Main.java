import domain.Car;
import domain.Cars;
import domain.Racing;
import ui.InputView;
import ui.ResultView;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = InputView.start();

        int attemptCount = InputView.attempt();

        Racing racing = new Racing(cars,attemptCount);

        List<Car> racingResult = racing.start();

        ResultView.printResult(racingResult);

    }

}
